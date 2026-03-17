package com.scuvc.week03;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;

/*
*  Java基础数据类型
*   8大基础类型
*   包装类型 byte->Byte
*          int -> Integer
* */
public class Demo01 {

    public static void main(String[] args) {
        // 1.整数类型
        byte b1 = 10;
        System.out.println(Byte.MIN_VALUE); // -128
        System.out.println(Byte.MAX_VALUE); // 127
        int i1 = 10;
        long i2 = 54354365476547575L;

        // 2.浮点类型-会丢失精度，不能随便用于数学运算
        float f1 = 0.1f;
        float f2 = 0.2f;
        float result = f1 * f2;
        System.out.println(result);  // 0.020000001

        // 如果浮点类型的数据要做数学运算，BigDecimal
        BigDecimal b2 = new BigDecimal("0.1");
        BigDecimal b3 = new BigDecimal("0.2");
        BigDecimal result2 = b2.multiply(b3);
        System.out.println(result2); // 0.02

        // 字符类型 ''
        char c1 = 'a';
        System.out.println(c1);  // a
        char c2 = '中';
        System.out.println(c2);  // 中
        char c3 = 97;
        System.out.println(c3);  // a

        // 布尔类型
        boolean b4 = true;
        boolean b5 = false;
        // int b5 = 100; 在同一作用域下不能定义相同名字的变量
        // 初始化：直接定义变量
        // 实例化：定义变量后赋值
        int i10;
        i10 = 10;
        // System.out.println(i10); 没有赋值的变量不能使用

        // 数据类型转换
        // 隐式转换-小转大
        byte b6 = 10;
        int i3 = b6;
        System.out.println(i3); // 10

        // 显式转换-大转小
        int b7 = 129;
        byte b8 = (byte) b7;
        System.out.println(b8);



    }

}
