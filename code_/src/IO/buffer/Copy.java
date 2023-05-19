package IO.buffer;

import java.io.*;

/**
 * @Description
 * @Author Michealzou@126.com
 * @Date 2023/5/19 22:24
 **/
public class Copy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        
        String line;
        while((line = br.readLine()) != null) {
            bw.write(line);
        }
        br.close();
        bw.close();
    }
}
