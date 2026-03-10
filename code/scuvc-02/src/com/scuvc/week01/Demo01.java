package com.scuvc.week01;

// 单行注释 快捷键：Ctrl+/
/*
*  多行注释 快捷键：Ctrl+Shift+/
*  目的：能够快速的清楚该代码的含义，不会被编译识别运行
*  这是2班的第一个Java类
*  类名命名规则：
*   1.首字母大写，后面的每个单词首字母大写
*  方法名命名规则：
*   1.首字母小写，后面每个单词的首字母大写
* */
public class Demo01 {
    /*
    *  包>类>方法>语句
    *  Java中所有的代码运行入口方法为main方法
    *  public：公共的，可以被所有类访问
    *  static:静态的，在内存中开辟空间来运行代码
    *  void:无返回值，不需要使用return来接收返回值
    *  main:主方法，Java中所有代码的运行入口
    *  String[] args：字符串类型的数组
    * */
    public static void main(String[] args) {
        // 输出语句：sout
        System.out.println("Hello World");

        int a = 100;
        int A = 99;
        int num01 = 100;
        int NUM = 100; // 常量命名规则：全大写，单词之间使用下划线连接
        // java是一门强类型的语言：定义变量时必须指定数据类型
        String str01 = "hello";
        // str02 = "world";

    }
    public void helloWorld() {

    }

}
