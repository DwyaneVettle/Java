package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Test01 {

    public static void main(String[] args) throws IOException {
        // 1.创建字节输入流对象
        FileInputStream fs = new FileInputStream("D:\\a.txt");
        
        // 2.读取文件中的数据
        int read = fs.read();
        /*System.out.println(read); // 97-字节
        System.out.println(read); // 98
        System.out.println(read); // 99
        System.out.println(read); // -1*/
        int i = 0;
        while((i = fs.read()) != -1){
            System.out.println((char)read); // 强制转换
        }
        // 3.关闭资源 --如果不关闭资源，下面的死循环仍占用文件资源，导致不能删除等操作
        fs.close();
        
        /*while (true) {
            
        }*/
        
    }
}
