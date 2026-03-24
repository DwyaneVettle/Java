package com.scuvc.week04;

import java.util.Scanner;

/*
* 要求：90分以上 优秀
		80~89 良好
		70~79 中等
		60~69 及格
		60分以下 不及格
* */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println("请输入成绩：");
        int score = new Scanner(System.in).nextInt();
        // 不能大于100，且不能小于0
        if (score <= 100 || score >= 0) {
            if (score >= 90) {
                System.out.println("优秀");
            } else if (score >= 80) {
                System.out.println("良好");
            } else if (score >= 70) {
                System.out.println("中等");
            } else if (score >= 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        } else {
            System.out.println("输入错误,请输入0-100之间的分数");
        }
    }
}
