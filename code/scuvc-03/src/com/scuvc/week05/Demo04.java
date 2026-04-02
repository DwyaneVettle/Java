package com.scuvc.week05;

import java.util.Scanner;

/**
 API:application programming interface 应用程序接口
 封装好的功能，我们直接调用即可
 java.lang包下 的左右API是不需要导包
 **/
public class Demo04 {

    public static void main(String[] args) {
        /*
        *  scanner:通过创建该对象接收用户输入的值，
        *  通过System的in实现标准输入，通过out实现标准输出，通过err实现错误输出
        * */
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        float v = scanner.nextFloat();
        boolean b = scanner.hasNextInt();
        System.out.println(i);
        System.out.println(v);
        System.out.println(b);

    }
}
