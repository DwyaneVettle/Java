package IO.buffer;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("1.txt",true);
        fw.write("\r\n哈哈");
        fw.close();
    }
}
