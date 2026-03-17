package com.scuvc.week03;

/**
 * @Description 数字求和，方法传参
 * @Author Michealzou@126.com
 * @Date 2026/3/17 16:41
 **/
public class Demo06 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name = "name";
        f1();
        f1(a);
        f1(a,b);
        f1(a,b,name);
    }
    private static void f1(int a, int b, String name) {
        System.out.println(a+b+name);//30name
    }

    private static void f1() {
        System.out.println("f1()");

    }

    private static void f1(int a) {
        System.out.println(a);

    }

    private static void f1(int a, int b) {
        System.out.println(a+b);

    }
}
