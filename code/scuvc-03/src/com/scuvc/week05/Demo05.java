package com.scuvc.week05;

import java.util.Scanner;

/*
*  练习：接收用户输入的两个整数，计算他们的和
* */
public class Demo05 {

    public static void main(String[] args) {
        System.out.println("请输入第一个整数：");
        int num01 = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个整数：");
        int num02 = new Scanner(System.in).nextInt();
        int result = num01 + num02;
        System.out.println("两个整数的和为：" + result);
    }
}
