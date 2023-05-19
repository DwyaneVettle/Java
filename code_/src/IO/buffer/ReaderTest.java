package IO.buffer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("1.txt");
        int i;
        while((i = fr.read()) != -1) {
            System.out.println((char)i);
        }
        fr.close();
    }
}
