package com.week09.api;
/*
String 变量名 = "值";

String 变量名 = new String();
String 变量名 = new String(String value);
String 变量名 = new String(char[] value);
* */
public class StringInit {

    public static void main(String[] args) {
        // 第一种初始化方式
        String s1 = "hello";

        // 第二种创建方式
        String s02 = new String();
        String s03 = new String("java");

        // 通过其他类型传递数组的形式创建
        byte[] arr = {97,98,99};
        String s04 = new String(arr);
        System.out.println(s04);


    }
}
