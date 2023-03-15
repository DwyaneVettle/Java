package com.week02;

import java.util.Arrays;

/*
*  数组的遍历：
*   for(int i ;i < 数组.length;i++) {}
*  需求：创建数组，保存每个月的天数，输出每个月有多少天
* */
public class ArrayTest02 {
    public static void main(String[] args) {
        // 把每个月的天数保存到数组中
        int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
        /*System.out.println(day[0]);
        System.out.println(day[1]);*/
        // 使用循环遍历出数组的下标
        for (int i = 0; i < day.length; i++) {
            System.out.println((i+1) + "月有：" + day[i] + "天");
        }

        // 需求：遍历数组，存入1-10
        int[] num = new int[10];
        /*num[0] = 1;
        num[1] = 2;*/
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        System.out.println(num); // [I@1b6d3586 - 这是一个地址值
        System.out.println(Arrays.toString(num));  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
