package com.scuvc.week02;

import java.util.Scanner;

/*
输入年号，判断是否是闰年。两个条件：
1、能被4整除，并且不能被100整除
2、或者能被400整除
*/
public class Demo02 {
    public static void main(String[] args) {
        System.out.println("请输入年份：");
        // 接收用户输入的数据
        int year = new Scanner(System.in).nextInt();
        //System.out.println(year);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
