package com.scuvc.week01;
// 这是单行注释 快捷键：Ctrl+/
/*
*  这是多行注释 快捷键：Ctrl+Shift+/
*  注释：供程序员看，理解代码，不会被编译
*  这是上计算机应用技术3班的第一个代码
*  注意：
*       1.类名首字母大写，多个单词组成，每个单词的首字母都必须大写
*       2.所有的代码都写到类的{}
*       3.每一个类要想运行，都必须要添加main方法
*       4.在idea中，输入main+回车帮助我们生成该方法
*       5.java中每个语句结束必须有;
* */
public class Demo01 {
    // main方法是程序的入口
    /*
    * main方法是固定写法 public static void main(String[] args) {}
    * public：公共的
    * static：静态的
    * void: 没有返回值 --> 没有返回值的方法，有返回值的方法return
    * main：方法名
    * */
    public static void main(String[] args) {
        // 输出语句：sout
        // ln表示换行
        System.out.print("Hello World");
        System.out.println("Hello World");
        System.out.print("Hello World");
    }
    // 方法名规范：首字母小写，后面每个单词的首字母大写（小驼峰式）
    public void helloWord() {

    }

    /*
    *  变量名规范：全部小写。多个单词之间用_隔开
    *  Java是强类型的语言，所有变量必须规定类型
    *   常量名所有字母大写，常量指不更改的变量
    * */
    int rmb = 100;
    int all_number = 0;
    boolean b = true;
    int SCORE = 98; // 常量



}
