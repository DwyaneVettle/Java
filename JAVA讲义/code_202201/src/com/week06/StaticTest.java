package com.week06;
/*
*  static关键字：
*       可以修饰方法、变量、常量
*       作用：被static修饰的方法、变量、常量是为这个类所用的，在类中直接开辟一个空间
*       被static修饰的被称为静态成员
*       访问格式：类名.静态成员
*  静态成员随着类的创建就开辟了空间使用
*   静态方法中不能使用this
*
*  常量：类中定义的最终的一个变量，不允许修改，常量名大写，一般使用final和static 修饰
* */
public class StaticTest {

    // 被static修饰的常量
    final static double PI = 3.1415; // 定义常量
    static int id;

    public void method01() {
        StaticTest.method02();
        System.out.println(StaticTest.PI);
        System.out.println(StaticTest.id);
    }

    public static  void method02() {
        System.out.println("这是静态方法。。。。");

    }

    public static void main(String[] args) {
        StaticTest st = new StaticTest();
        st.method01();
    }
}
