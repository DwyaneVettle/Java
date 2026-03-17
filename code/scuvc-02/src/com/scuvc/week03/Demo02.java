package com.scuvc.week03;

/**
 * 运算符
 **/
public class Demo02 {
    public static void main(String[] args) {
        /*
        *  - **如果++在前，那么变量先+1,再拿着结果使用；**---先变化后使用
            - **如果++在后，那么先使用变量本来的值，再让变量+1**。---先使用再变化
        * */
        int i = 100;
        System.out.println(++i); // 101
        System.out.println(i); // 101
        int i2 = 10;
        System.out.println(i2++); // 10
        System.out.println(i2); // 11

        /*
        *  三元运算符
        * 数据类型 变量名 = 布尔表达式 ? 结果1 : 结果2;
        * 布尔表达式返回为true，变量=结果1
        * 布尔表达式返回为false，变量=结果2
        * */
        System.out.println("==================");
        int i1 = 1 == 2 ? 100 : 200;
        System.out.println(i1);  // 200
        int i3 = 1 == (100 >= 99 ? 1 : 2) ? 100 : 200;
        System.out.println(i3);  // 100

    }
}
