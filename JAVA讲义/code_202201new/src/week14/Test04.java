package week14;

import java.util.Properties;

/**
 * @Description Properties
 * @Author Michealzou@126.com
 * @Date 2023/5/25 11:38
 **/
public class Test04 {

    public static void main(String[] args) {
        // 1.创建对象
        Properties prop = new Properties();
        // 存数据setProperty()
        prop.setProperty("username","admin");
        prop.setProperty("password","123456");
        
        // 获取数据getProperty()
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        System.out.println(username + "-" + password);
        
    }
}
