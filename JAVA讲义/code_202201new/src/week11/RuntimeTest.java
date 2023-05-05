package week11;

import java.io.IOException;

/*
* Runtime用于描述Java虚拟机的运行环境
* int availableProcessors(); 获取处理器的个数
* long freeMemory();获取空闲内存
* long maxMemory();获取最大的内存
* Process exec();执行DOS命令
* */
public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        // 获取实例
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.availableProcessors());
        System.out.println((rt.freeMemory()) / 1024 / 1024 + "MB");
        System.out.println((rt.maxMemory()) / 1024 / 1024 + "MB");
        Process exec = rt.exec("notepad.exe"); // 打开记事本
    }
}
