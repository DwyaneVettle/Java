package week15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    OutputStream:代码->文件
        write()
        往文件写入内容时，新的内容会把旧的内容覆盖
        如果不想覆盖FileOutputStream(File file, boolean append) 
* */
public class Test04 {

    public static void main(String[] args) throws IOException {
        // 1.创建输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\a.txt",true);
        
        // 2.写出操作
        fos.write(97);
        byte[] bytes = "你好".getBytes();
        // 回车换行的转义符
        fos.write("\r\n".getBytes());
        fos.write(bytes);
        // 3.关闭资源
        fos.close();
    }
}
