package com.week08.innerclass;
// 测试成员内部类
/*
*   创建成员内部类对象的方式：
*       外部类.内部类  对象名 = new 外部类对象().new 内部类对象()
*   成员内部类只能访问内部类的属性和方法
* 
*  创建静态内部类对象的方式：
*       外部类名.静态内部类名 对象名 = new 外部类名.静态内部类
* */
public class Test01 {
    public static void main(String[] args) {
        // 成员内部类
        Outer.Inner oi = new Outer().new Inner();
        oi.innerMethod();
        System.out.println(oi.inner);

        System.out.println("============");
        // 静态内部类
        Outer.Inner02 oi02 = new Outer.Inner02();
        System.out.println(oi02.inner02);
        oi02.method02();

    }
}
