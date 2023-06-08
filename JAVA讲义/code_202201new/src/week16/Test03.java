package week16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
    字符读取流：Reader  源--> 代码
    字符写出流：Writer  代码 --> 源
 **/
public class Test03 {
    public static void main(String[] args) throws IOException {
        // 字符流读取中文不乱码
        FileReader fr = new FileReader("D:\\a.txt");
        
        int i = 0;
        while((i = fr.read()) != -1) {
            System.out.println((char)i);
        }

        fr.close();
        
    }
}
