package week16;

import java.io.*;

/**
 * 字节缓冲区
 *  
 **/
public class Test02 {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\demo.wmv");
        FileOutputStream fos = new FileOutputStream("D:\\copy.wmv");
        
        // 如果文件比较大，创建缓冲区
        // byte[] bytes = new byte[1024];
        // 创建字节缓冲流
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int i = 0;
        while((i= bis.read()) != -1) {
            bos.write(i);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end -start);
    }
}
