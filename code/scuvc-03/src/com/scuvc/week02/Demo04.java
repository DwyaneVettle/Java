package com.scuvc.week02;

import java.util.Scanner;

/*
*  方法：
*   将功能提取到代码块中，实现代码的复用
* 定义： public(公共的-其他地方能使用) private(私有的-只能在当前类中使用)
* 修饰符 返回值类型 方法名(参数) {
	代码;
	return;
}
* 调用：方法名();
*
* 重载：
* 在一个类中，允许方法名相同，但要求参数个数/类型不同
* */
public class Demo04 {
    public static void main(String[] args) {
        String str01 = method01();
        System.out.println(str01);
        method01();
        int i = new Scanner(System.in).nextInt();
        method02(i);
        // method03();
    }
    public static String method01() {
        // return表示这个方法已经返回了值，在此后面的代码没有意义
        System.out.println("hello world");
        return "hello";
    }

    public static void method02(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }

    }

    // 方法重载
    public static void method03(int i) {
        System.out.println("这是第一个方法");
    }

    public static void method03(String i) {
        System.out.println("这是第一个方法");
    }

    public static void method03(int i, int j, String str) {
        System.out.println("这是第一个方法");
    }

}
