package com.scuvc.week04;

/*
*  嵌套循环：
*       外循环控制行，内循环控制列
* */
public class Demo06 {

    public static void main(String[] args) {
        // 打印99乘法表
        for (int i = 1;i <= 9;i++) { // 外循环控制行
            for (int j = 1;j <= i;j++) { // 内循环控制列
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}
