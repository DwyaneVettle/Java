package com.scuvc.week03;

/**
 * @Description  continue和break
 * @Author Michealzou@126.com
 * @Date 2026/3/19 16:59
 * 区别：
 *  1.continue和break可以用在循环语句，也可以用在条件语句，但一般都用在循环中
 *  2.continue是跳出本次循环继续下面的循环，break是结束所有的循环直接跳出
 *  3.continue和break后面不能跟任何语句
 **/
public class Demo07 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                //break; 直接跳出，输出1-2
                continue; // 跳过3的倍数，输出其他数字
            }
            System.out.println(i);
        }
    }
}
