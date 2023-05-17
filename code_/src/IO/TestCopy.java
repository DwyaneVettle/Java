package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
完成文件拷贝
    1.创建输入/输出流对象
            输入流对象关联要拷贝的数据源
            输出流对象关联要拷贝数据的目的
    2.在读取的过程中，将数据写到目标文件中
    3.关闭资源
*/
public class TestCopy {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 1.创建输入输出流对象
            fis = new FileInputStream("D:\\demo.wmv");
            fos = new FileOutputStream("D:\\softtest\\copy.wmv");

            // 2.在读取过程中，将数据写出到目标文件
            int i;
            while((i = fis.read()) != -1) {
                fos.write(i);
            }
        } catch (IOException e) {
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
