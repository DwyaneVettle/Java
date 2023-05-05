package colloctions;

import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        // 创建对象
        Properties p = new Properties();
        p.setProperty("username","admin");
        p.setProperty("password","123456");

        // 获取集合中的数据getProperty()
        String userName = p.getProperty("userName");
        String password = p.getProperty("password");

        System.out.println("用户为："+ userName + ",密码为：" + password);
    }
}
