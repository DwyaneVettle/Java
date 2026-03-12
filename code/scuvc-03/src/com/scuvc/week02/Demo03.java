package com.scuvc.week02;

import java.util.Scanner;

/*
* 接收用户数输入的3个数，求3个数的最大值
* */
public class Demo03 {

    public static void main(String[] args) {
        System.out.println("请输入3个整数");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();

        // 用一个变量保存最大值
        //int max = num01;
        int max = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("最大值是：" + max);

    }
}
