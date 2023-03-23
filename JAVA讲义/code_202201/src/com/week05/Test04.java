package com.week05;
/*
*  需求：用方法重载的方式定义三个方法，传递不同的类型的参数
*       方法名：test
*           1.形式参数有两个：int String
*           2.形式参数有4个：int float double String
*           3.形式参数有0个
* */
public class Test04 {
    public static void main(String[] args) {

    }

    public static void test(int a,String b) {
        return;
    }

    public static void test(int a,float b,double c,String d) {
        return;
    }

    public static void test() {
        return;
    }
}
