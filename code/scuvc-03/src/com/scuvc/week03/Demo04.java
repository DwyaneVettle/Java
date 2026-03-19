package com.scuvc.week03;

/**
 * @Description for循环
 * @Author Michealzou@126.com
 * @Date 2026/3/19 15:52
 * for(开始条件1；循环条件2；更改条件4){
 *        循环体代码3…
 * }
 **/
public class Demo04 {
    public static void main(String[] args) {
        // 打印1-10的数字,通过快捷键fori能生成for循环的结构
        //for (int i = 1; i < 11; i++) {
        //    System.out.println(i);
        //}

        // 打印8，88，888，8888
        //for (int i = 8; i <= 8888; i=i*10+8) {
        //    System.out.println(i);
        //}

        // 求【0，100】中奇数的个数
        int count = 0; // 定义初始化变量，用来统计个数
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println("【0，100】中奇数的个数为：" + count);
    }

}
