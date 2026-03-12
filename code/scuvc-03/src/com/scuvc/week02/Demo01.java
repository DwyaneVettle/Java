package com.scuvc.week02;


import java.math.BigDecimal;

/*
  初始化：产生对象
  实例化：产生对象的同时必须给该对象的属性定义值

* 用于测试数据类型
* java是一门强类型的语言，在定义变量时必须定义其类型
* Java有8大基础数据类型
* 整数类型
*   byte 1个字节 -128~127
*   short 2个字节 -32768~32767
*   int 4个字节 -2147483648~2147483647
*   long 8个字节 -9223372036854775808~9223372036854775807
* MAX_VALUE   MIN_VALUE
* 小数类型
*   float 4个字节，慎用-丢失精度
*   double 8个字节,慎用-丢失精度
*   在开发中可以采用BigDemail来定义小数
* 字符类型
*   char 2个字节 ''
*   在Java中通常使用String来定义字符串 ""
* 布尔类型
*   boolean 1个字节 true(1) false(0)
*
* */
public class Demo01 {
    public static void main(String[] args) {
        byte a = 10;
        // byte b = 200;

        int c = 32;
        //int d = 50000000000；

        long e = 1000000000000000000L;

        long f = 1L;
        //g = 100;
        float f1 = 0.1f;
        float f2 = 0.2f;
        float result = f1 * f2;
        System.out.println(result); // 0.020000001
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        System.out.println(b1.multiply(b2)); // 0.02

        char ch = 'a';
        System.out.println(ch);
        System.out.println("=============");
        char ch1 = 65;
        System.out.println(ch1);
        char ch2 = '中';
        System.out.println(ch2);

        System.out.println("=============");
        // 最大值和最小值的查看
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        // 在同一个大括号范围内，变量的名字不可以相同
        //int ch2 = 100;
        // java中对象的创建依照先来后出的规则
        // System.out.println(num1);
        // 定义的变量，不赋值不能使用；
        int num1;
        num1 = 100;
        System.out.println(num1);


        // 数据转转
    //    小转大-隐式转换
        byte b01 = 10;
        int num02 = 10000;
        System.out.println(b01 + num02);

        int num03 = 365;
        byte b02 = (byte) num03; // 强制转换

        System.out.println("==============");
        //计算：光速运行一年的长度是多少米
        // System.out.println(300000000*60*60*24*365);

        /*
        * - **如果++在前，那么变量先+1,再拿着结果使用；**---先变化后使用
            - **如果++在后，那么先使用变量本来的值，再让变量+1**。---先使用再变化
        * */
        int num04 = 10;
        System.out.println(num04++); // 10
        System.out.println(num04); // 11
        System.out.println("==============");

        int num05 = 10;
        System.out.println(++num05); // 11
        System.out.println(num05); // 11
        System.out.println("==============");
        // 三元表达式：数据类型 变量名 = 布尔表达式 ? 结果1 : 结果2;
        // 如果表达式结果为真，取结果1，反之取结果2
        String str01 = 2>=1 ? "2大于1" : "2小于1";
        System.out.println(str01);
    }
    public void method02() {
        // 从定义的变量一行开始，一直到所属的大括号结束。
        // num01
    }
}
