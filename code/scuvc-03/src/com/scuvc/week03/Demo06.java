package com.scuvc.week03;

/** while循环
 * @Description
 * @Author Michealzou@126.com
 * @Date 2026/3/19 16:46
 * 初始化表达式①
 * while(布尔表达式②){
 * 循环体③
 * 步进表达式④
 * }
 * 执行流程:
 *
 * - 初始化表达式① while(布尔表达式②){ 循环体③ 步进表达式④
 * - ①负责完成循环变量初始化
 * - ②负责判断是否满足循环条件，不满足则跳出循环
 * - ③具体执行的语句
 * - ④循环后，循环变量的变化情况。
 **/
public class Demo06 {

    public static void main(String[] args) {
        //// while循环输出1-10
        //int i = 1;
        //while (i <= 10) {
        //    System.out.println(i);
        //    i++;
        //}

        // 计算1-100之间的和
        //int i = 1; // 初始化表达式开始的条件
        //int sum = 0; // 初始化求和的条件
        //while (i <= 100) {
        //    sum += i;
        //    i++;
        //}
        //System.out.println("1-100之间所有数的和为：" + sum);


        // 如果条件永远为真时，那么程序会陷入死循环
        //while(true) {
        //    System.out.println("hello world");
        //}
    }
}
