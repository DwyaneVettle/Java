package API.runtime;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt);
        System.out.println(rt.availableProcessors()); // 4
        System.out.println((rt.freeMemory()) / 1024 /1024 + "MB");
        System.out.println((rt.maxMemory()) / 1024 /1024 + "MB");

        Process ip = rt.exec("notepad.exe"); // 打开记事本
    }
}
