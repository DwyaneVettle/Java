package com.scuvc.week03;

import java.util.Scanner;

/** 分支练习
 * @Description
 * @Author Michealzou@126.com
 * @Date 2026/3/19 14:39
 *      90分以上 优秀
 *		80~89 良好
 *      70~79 中等
 *      60~69 及格
 *      60分以下 不及格
 **/
public class Demo02 {
    public static void main(String[] args) {
        System.out.println("请输入您的分数：");
        int score = new Scanner(System.in).nextInt();
        if (score < 0 || score > 100) {
            System.out.println("您的分数错误！");
        } else {
            // 多重判断
            if (score >= 90) {
                System.out.println("优秀");
            } else if (score >= 80 && score < 90) {
                System.out.println("良好");
            } else if (score >= 70 && score < 80) {
                System.out.println("中等");
            } else if (score >= 60 && score < 70) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        }
    }

}
