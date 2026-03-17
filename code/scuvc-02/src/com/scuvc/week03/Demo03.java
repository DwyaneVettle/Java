package com.scuvc.week03;

import java.util.Scanner;

/*
输入年号，判断是否是闰年。两个条件：
1、能被4整除，并且不能被100整除
2、或者能被400整除
*/
public class Demo03 {
    public static void main(String[] args) {
        // 用户输入年号
        int year = new Scanner(System.in).nextInt();
        // 判断是否是闰年
        String r = "平年";
        /*if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            r = "闰年";
        } else {
            r = "平年";
        }*/
        r = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
                ? "闰年" : "平年";
        System.out.println(year + "是" + r);
    }

}
