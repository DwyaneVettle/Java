package com.week03;
/*
* 方法参数的传递
*   参数：方法名括号内定义的变量
*   参数的个数可有1个，2个。。。。多个参数之间用逗号隔开
* */
public class Demo05 {

    // 定义一个两数相减的方法 sub
    public static int sub(int num01,int num02) {
        // 通过return关键字将结果返回出去,返回的类型一定是方法放回值类型
        return num01-num02;
    }

    // 定义两个数相加的方法
    public static void add(int num01,int num02) {
        System.out.println(num01 + num02);
    }

    public static void main(String[] args) {
        /*如果方法在定义是有参数，在方法调用时必须传递参数
        实参的个数一定要匹配形参的个数
            形参:形式参数---在方法定义时传递的参数
            实参：实际的参数---在方法调用时传递的参数

        */
        add(5,6);
        add(100,100);
        // 当方法有返回值时，必须在调用方法的地方用变量接收返回值
        int a = sub(100,50);
        System.out.println(a);
    }
}
