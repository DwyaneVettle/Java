package IO;

import java.io.*;

public class BufferedInputStreaTest {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        // 1.创建对象
        FileInputStream is = new FileInputStream("D:\\demo.wmv");
        FileOutputStream os = new FileOutputStream("D:\\test.wmv");
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(os);
        // 2.读写操作
        int i;
        while((i = bis.read()) != -1) {
            bos.write(i);
        }
        bos.close();
        bis.close();
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000);
    }
}
