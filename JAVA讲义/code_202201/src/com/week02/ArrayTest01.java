package com.week02;

/*
*  数组的使用：
*       1.数组的创建
*           A：动态初始化：数据类型[] 数组名 = new 数据类型[初始化个数]
*           B:静态初始化：数据类型[] 数组名 = {元素1，元素2，元素3。。。}
*       2.访问数组元素： 数组名[index]
*       3.数组是有默认值的:
*           int:0
*           String和所有的引用类型:null
*           float:0.0
*           bool：false
*       4.访问数组元素不能下标越界
* */
public class ArrayTest01 {
    public static void main(String[] args) {
        /*
        * 创建数组保存hello
        * */
        // 1.静态初始化
        char[] a01 = new char[] {'h','e','l','l','o'};
        // 2.动态初始化
        char[] a02 = new char[5];
        // 下标存放元素
        a02[0] = 'h';
        a02[1] = 'e';
        a02[2] = 'l';
        a02[3] = 'l';
        a02[4] = 'o';
        System.out.println(a01);
        System.out.println(a02);
        // length属性可以查看数组的长度
        int a = a01.length;
        System.out.println(a);
        System.out.println(a02[1]);

        int[] b = new int[3];
        System.out.println(b[0]);
        String[] c = new String[5];
        System.out.println(c[0]);
        System.out.println("=========");
        System.out.println(a02[1]);
    }
}
