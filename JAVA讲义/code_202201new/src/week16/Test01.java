package week16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
*   文件的拷贝
*       1.创建输入/输出流对象
*           输入流读取磁盘中的源文件
*           输出流将读取到的源文件写入到磁盘
*       2.先读取在写入
*       3.关闭资源
* */
public class Test01 {
    public static void main(String[] args)  {

        long start = System.currentTimeMillis();
        //1.创建输入/输出流对象
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\demo.wmv");
            fos = new FileOutputStream("D:\\Software\\copy.wmv");
            
            // 创建一个容纳1024字节的缓冲区
            byte[] bytes = new byte[1024];
            // 2.先读后写
            int i = 0;
            while((i = fis.read(bytes)) != -1) {
                fos.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
                if(fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        
        
        
        
        


    }
}
