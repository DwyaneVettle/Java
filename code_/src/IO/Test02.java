package IO;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {

    public static void main(String[] args) throws IOException {
        // 1.创建字节输出流对象
        FileOutputStream fs = new FileOutputStream("D:\\1.txt");
        // 2.写出数据
        fs.write(97);
        fs.write("\r\n".getBytes()); // 回车换行转义字符
        byte[] bytes = "你好".getBytes();
        fs.write(bytes);
        
        // 3.关闭资源
        fs.close();
    }
}
