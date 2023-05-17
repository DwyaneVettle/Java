package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 缓冲区
public class TestCopyBuffer {

    public static void main(String[] args) throws FileNotFoundException {
        
        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 1.创建输入输出流对象
            fis = new FileInputStream("D:\\demo.wmv");
            fos = new FileOutputStream("D:\\copy.wmv");

                // 2.创建缓冲区
            byte[] bytes = new byte[1024];

            // 2.在读取过程中，将数据写出到目标文件
            int i;
            while((i = fis.read(bytes)) != -1) {
                fos.write(i);
            }
        } catch (
        IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    // 3.关闭资源
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    // 3.关闭资源
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000);
        }
}
