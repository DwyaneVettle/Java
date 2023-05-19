package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("1.txt"); // 文件和src同级
        
        int i;
        while((i = fis.read()) != -1) {
            System.out.println((char)i);
        }
        fis.close();
    }
}
