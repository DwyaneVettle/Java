# Java GUI-登录注册功能实现

技术栈：

- MySQL8.0
- JFrame
- Swing

功能描述：

![image-20240516102838884](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202405161028562.png)

- 登录：输入用户名、密码点击登录调转到登录页面
- 注册：点击注册按钮，输入用户名和密码注册成功并返回注册页面
- 注：本项目登录注册没有实现数据库验证功能

实施步骤：



1.创建数据库数据表：

![image-20240516103333436](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202405161033244.png)

2.在lib目录下导入连接数据库需要的包，utils包下创建db.properties文件连接数据库，ConnectionFactory.java用于处理读取db.properties文件：

![image-20240516103603250](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202405161036413.png)

db.properties:

```properties
driverClassName=com.mysql.jdbc.Driver
url= jdbc:mysql://localhost:3306/user?useSSL=false&serverTimezone=UTC
username=root
password=root
# 初始化连接池数量
initialSize=5
# 最大连接数
maxActive=10
# 最大等待时间
maxWait=3000
```

ConnectionFactory.java:

```java
package com.scuvc.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    //这是德鲁伊连接池对象
    private static DruidDataSource ds;
    private static Connection conn;
    static{
        Properties pops = new Properties();
        try {
            pops.load(ConnectionFactory.class.getResourceAsStream("db.properties"));
            ds = (DruidDataSource) DruidDataSourceFactory.createDataSource(pops);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DruidDataSource getDruidDataSource(){
        return ds;
    }
    public static Connection getConnection(){
        try {
            conn = ds.getConnection();
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //封装开启/关闭事务事务
    public static void setAutoCommit(boolean flag,Connection connection){
        try {
            connection.setAutoCommit(flag);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //关闭Connection连接资源
    public static void close(Connection connection){
        try {
            if(connection!=null && !connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //回滚事务
    public static void rollback(Connection connection){
        try {
            connection.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //提交事务
    public static void commit(Connection connection){
        try {
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

3.创建数据库对应的实体类：

```java
package com.scuvc.entity;

public class UserEntity {


    private String username;
    private String password;

    public UserEntity() {
    }

    public UserEntity(String username, String password) {

        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
```

4.创建UserDao.java：

```java
package com.scuvc.dao;

import com.scuvc.entity.UserEntity;
import com.scuvc.utils.ConnectionFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDao {

    QueryRunner qr = new QueryRunner(ConnectionFactory.getDruidDataSource());

    public Boolean login(String account, String password) throws SQLException {
        String sql = "select * from user where username=?";
        List<UserEntity> query = qr.query(sql, new BeanListHandler<UserEntity>(UserEntity.class), account);
        if (query.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean register(String account, String password) throws SQLException {

        String sql = "insert into user(username,password) values(?,?)";
        int update = qr.update(sql, account, password);
        if(update>0) {
            return true;
        } else {
            return false;
        }
    }
}
```

5.创建Login.java(登录页面)，Register.java(注册页面)，Home.java，该类为启动后的登录页面：

Login.java

```java
package com.scuvc.controller;

import com.scuvc.dao.UserDao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
// 登录功能验证验证
public class Login {
    static UserDao userDao = new UserDao();
    public static class LoginListener implements ActionListener {
        private javax.swing.JTextField jt;//账号输入框对象
        private javax.swing.JPasswordField jp;//密码输入框对象
        private javax.swing.JFrame login;//定义一个窗体对象

        public LoginListener(javax.swing.JFrame login, javax.swing.JTextField jt, javax.swing.JPasswordField jp) {
            this.login = login;//获取登录界面
            this.jt = jt;//获取登录界面中的账号输入框对象
            this.jp = jp;//获取登录界面中的密码输入框对象
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //用户名密码判断
            if (jt.getText().equals("") && jp.getText().equals("")) {
                //设置弹框
                JOptionPane.showMessageDialog(null, "用户名或密码不能为空", "登录失败", 0);
            }
            try {
                if (userDao.login(jt.getText(), jp.getText()))  {
                    JOptionPane.showMessageDialog(null, "登录成功", "成功", 1);
                    login.setVisible(false);
                    Index.createShow();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


        }
    }
}

```

Register.java:

```java
package com.scuvc.controller;

import javax.swing.*;
import java.awt.*;

public class Register {
    public static void reShow() {
        //创建JFrame实例
        JFrame frame = new JFrame("欢迎注册");
        //设置窗体宽高
        frame.setSize(1200, 600);
        frame.setLocationRelativeTo(null); //设置窗口居中显示
        //设置窗体禁止调节大小
        frame.setResizable(false);
        //创建面板
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);

        JLabel label = new JLabel("欢迎来到注册页面!");
        label.setBounds(280, 0, 250, 25);
        label.setFont(new Font("微软雅黑", Font.BOLD, 25));
        label.setForeground(Color.red);
        jPanel.add(label);
        //关闭窗口结束程序
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        //显示窗口
        frame.setVisible(true);

        //添加面板
        frame.add(jPanel);
        //设置可见
        frame.setVisible(true);
    }
}

```

Home.java:

```java
package com.scuvc.controller;

import com.scuvc.dao.UserDao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Home {
    static UserDao userDao = new UserDao();
    static RegisterFrame rt = new RegisterFrame();
    public void creatJf() {
        //创建JFrame实例
        JFrame frame = new JFrame("Login");
        JFrame frame01 = new JFrame("注册");
        //设置窗体宽高
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null); //设置窗口居中显示
        //设置关闭窗口结束程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗体禁止调节大小
        frame.setResizable(false);
        //创建面板
        JPanel jPanel = new JPanel();

        jPanel.setLayout(null); //布局设置为空，之后可以手动设置组件的坐标位置和大小

        //创建JLabel(用户名)
        JLabel user_label = new JLabel("用户名:");
        user_label.setFont(new Font("微软雅黑", 0, 13));
        //定义组件的位置和宽高
        user_label.setBounds(10, 20, 80, 25);
        //把组件添加到JPanel上
        jPanel.add(user_label);

        //创建文不域用于用户输入
        JTextField user_text = new JTextField(20);
        //设置文本域的位置和宽高
        user_text.setBounds(100, 20, 165, 25);
        //把文本域组件添加上
        jPanel.add(user_text);

        //创建JLabel(密码)
        JLabel password_label = new JLabel("密码:");
        password_label.setFont(new Font("微软雅黑", 0, 13));
        //设置位置和大小
        password_label.setBounds(10, 50, 80, 25);
        //添加组件
        jPanel.add(password_label);

        //密码文本域输入
        JPasswordField password_text = new JPasswordField();  //密码输入框，输入密码自动隐藏
        //JTextField password_text = new JTextField(20);
        password_text.setBounds(100, 50, 165, 25);

        jPanel.add(password_text);


        //登录按钮
        JButton login = new JButton("登录");
        login.setBounds(80, 100, 80, 25);


        //注册按钮
        JButton register = new JButton("注册");
        register.setBounds(200, 100, 80, 25);

        jPanel.add(register);

        jPanel.add(login);


        //添加面板
        frame.add(jPanel);
        //设置可见
        frame.setVisible(true);
        Login.LoginListener ll = new Login.LoginListener(frame, user_text, password_text);
        login.addActionListener(ll);

        ReListener re = new ReListener(frame01, user_text, password_text);
        register.addActionListener(re);

    }

    public static class ReListener implements ActionListener {
        private javax.swing.JTextField jt;//账号输入框对象
        private javax.swing.JPasswordField jp;//密码输入框对象
        private javax.swing.JFrame login;//定义一个窗体对象
        Home index = new Home();

        public ReListener(javax.swing.JFrame register, javax.swing.JTextField jt, javax.swing.JPasswordField jp) {
            this.login = register;//获取登录界面
            this.jt = jt;//获取登录界面中的账号输入框对象
            this.jp = jp;//获取登录界面中的密码输入框对象
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Register.reShow();
            rt.createRegister();
            Boolean register = false;
            if(jt.getText().equals("") || jp.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "账号或密码不能为空", "失败", 0);
            } else {
                try {
                    register = userDao.register(jt.getText(), jp.getText());
                    if (register) {
                        JOptionPane.showMessageDialog(null, "注册成功", "成功", 1);
                        login.setVisible(false);
                        // Login.createShow();
                        index.creatJf();
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
```

RegisterFrame.java为注册页面：

```java
package com.scuvc.controller;

import javax.swing.*;
import java.awt.*;

public class RegisterFrame {
    public void createRegister() {
        //创建JFrame实例
        JFrame frame = new JFrame("Register");
        //设置窗体宽高
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null); //设置窗口居中显示
        //设置关闭窗口结束程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗体禁止调节大小
        frame.setResizable(false);
        //创建面板
        JPanel jPanel = new JPanel();

        jPanel.setLayout(null); //布局设置为空，之后可以手动设置组件的坐标位置和大小

        //创建JLabel(用户名)
        JLabel user_label = new JLabel("用户名:");
        user_label.setFont(new Font("微软雅黑", 0, 13));
        //定义组件的位置和宽高
        user_label.setBounds(10, 20, 80, 25);
        //把组件添加到JPanel上
        jPanel.add(user_label);

        //创建文不域用于用户输入
        JTextField user_text = new JTextField(20);
        //设置文本域的位置和宽高
        user_text.setBounds(100, 20, 165, 25);
        //把文本域组件添加上
        jPanel.add(user_text);

        //创建JLabel(密码)
        JLabel password_label = new JLabel("密码:");
        password_label.setFont(new Font("微软雅黑", 0, 13));
        //设置位置和大小
        password_label.setBounds(10, 50, 80, 25);
        //添加组件
        jPanel.add(password_label);

        //密码文本域输入
        JPasswordField password_text = new JPasswordField();  //密码输入框，输入密码自动隐藏
        //JTextField password_text = new JTextField(20);
        password_text.setBounds(100, 50, 165, 25);

        jPanel.add(password_text);

        //注册按钮
        JButton register = new JButton("注册");
        register.setBounds(200, 100, 80, 25);

        jPanel.add(register);




        //添加面板
        frame.add(jPanel);
        //设置可见
        frame.setVisible(true);

        Home.ReListener re = new Home.ReListener(new JFrame(),user_text,password_text);
        register.addActionListener(re);

    }
}

```

6.创建Index.java为登录成功返回的页面：

```java
package com.scuvc.controller;

import javax.swing.*;
import java.awt.*;
// 登录成功的页面返回
public class Index {
    public static void createShow() {
        //创建JFrame实例
        JFrame frame = new JFrame("欢迎您");
        //设置窗体宽高
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null); //设置窗口居中显示
        //设置窗体禁止调节大小
        frame.setResizable(false);
        //创建面板
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);

        JLabel label = new JLabel("欢迎您!");
        label.setBounds(250, 0, 100, 25);
        label.setFont(new Font("微软雅黑", Font.BOLD, 25));
        label.setForeground(Color.red);
        jPanel.add(label);
        //关闭窗口结束程序
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        //显示窗口
        frame.setVisible(true);

        //添加面板
        frame.add(jPanel);
        //设置可见
        frame.setVisible(true);
    }
}

```

7.创建启动类View.java:

```java
package com.scuvc.controller;

public class View {
    public static void main(String[] args) {
        Home l=new Home();
        l.creatJf();
    }
}
```

项目结构：

![image-20240516104343993](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202405161043019.png)