package week15;

import week13.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
    Properties：有一个方法load()，用来读取配置文件的
        配置文件往往以.properties或者.yaml结尾
        有一个方法store()，用来向配置文件写入配置项的
* */
public class Test01 {

    public static void main(String[] args) throws IOException {
        // 1.创建Properties对象
        Properties prop = new Properties();
        // 2.创建流对象
        FileInputStream fis = new FileInputStream("src/week15/config.properties");
        prop.load(fis);
        String userName = prop.getProperty("userName");
        String password = prop.getProperty("password");
        System.out.println("用户名为：" + userName + ",密码为：" + password);

        prop.setProperty("sex","man");
        prop.store(new FileOutputStream("src/week15/config.properties")
                ,"更新性别");
    }
}
