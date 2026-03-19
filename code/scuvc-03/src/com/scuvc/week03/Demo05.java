package com.scuvc.week03;

/**
 * @Description 嵌套for循环
 * @Author Michealzou@126.com
 * @Date 2026/3/19 16:14
 * for(…){
 *        for(…){
 * 	    }
 * }
 * 根据外层的条件，判断里层能否执行，如果能执行，
 * 就把里层代码都循环完毕后，再继续执行外层，继续判断
 * 外循环控制行
 * 内循环控制列
 **/
public class Demo05 {

    public static void main(String[] args) {
        // 打印5x5正方形*
        //for (int i = 1;i <= 5;i++) {
        //    for (int j = 1; j <= 5;j++) {
        //        System.out.print("*");
        //    }
        //    System.out.println();
        //
        //}


        // 打印99乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + "*" + i + "=" + (i*j) + "\t");
            }
            System.out.println();
        }
    }

}
