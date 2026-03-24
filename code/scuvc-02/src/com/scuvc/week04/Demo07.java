package com.scuvc.week04;
/*
*  break和continue的区别：
*   1.break是结束整个循环，不再继续
*   2.continue是结束当前循环，继续下次循环
*   3.break和continue只能用于循环结构中
*   4.break和continue后不能跟任何的代码
* */
public class Demo07 {

    public static void main(String[] args) {
        //for (int i = 1; i < 100;i++) {
        //    // i是10的倍数输出
        //    if (i % 10 == 0) {
        //        System.out.println(i);
        //    } else {
        //        continue;
        //    }
        //}

        for (int i = 1; i < 100;i++) {
            if (i % 10 == 0) {
                break; // 终止当前进程
                // System.out.println(11);
            }
            System.out.println(i);
        }
    }
}
