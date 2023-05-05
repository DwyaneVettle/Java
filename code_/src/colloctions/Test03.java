package colloctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test03 {

    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        // 通过load方法加载void load(InputStream in)
        prop.load(new FileInputStream("src/colloctions/config.properties"));

        String userName = prop.getProperty("userName");
        String password = prop.getProperty("password");
        System.out.println("用户为："+ userName + ",密码为：" + password);

        // 用store(OutputStream out,String comments) 将集合数据通过输出流写入文件
        prop.setProperty("tel","13800138000");
        prop.store(new FileOutputStream("src/colloctions/config.properties"),"更新手机号");
    }
}
