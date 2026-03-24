package com.scuvc.week04;

/*
*
* for(开始条件1；循环条件2；更改条件4){
       循环体代码3…
}
* */
public class Demo05 {

    public static void main(String[] args) {
        // 打印8，88，888，8888
        //for (int i = 8; i <= 8888; i= i*10+8) {
        //    System.out.println(i);
        //}

        /*
        *
            练习5：求【0，100】中偶数的和
        * */
        //int sum = 0; // 初始化求和的变量
        //for (int i = 0; i <= 100;i++) {
        //    if (i % 2 == 0) {
        //        sum = i + sum;
        //    }
        //}
        //System.out.println(sum);

        // 练习4：求【0，100】中奇数的个数
        int count = 0; // 初始化一个求个数的变量
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
