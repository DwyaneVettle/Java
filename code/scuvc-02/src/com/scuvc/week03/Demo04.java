package com.scuvc.week03;

import java.sql.SQLOutput;
import java.util.Scanner;


/**
 * @Description 求用户输入3个数的最大值
 * @Author Michealzou@126.com
 * @Date 2026/3/17 16:12
 **/
public class Demo04 {

    public static void main(String[] args) {
        max();
    }
    public static void max(){
        System.out.println("请输入三个整数：");
        int i1 = new Scanner(System.in).nextInt();
        int i2 = new Scanner(System.in).nextInt();
        int i3 = new Scanner(System.in).nextInt();
        int i5 = (i1 > i2 ? i1 : i2) > i3 ? (i1 > i2 ? i1 : i2) : i3;
        System.out.println("最大值为：" + i5);
    }
}
