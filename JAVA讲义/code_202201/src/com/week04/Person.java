package com.week04;
/*
* 人类的描述类*/
public class Person {
    // 属性
    // 姓名
    String name;  // 在类中定义的为全局变量
    // 年龄
    int age;

    // 行为
    public  void eat(String food) {
        // 在方法中定义的为局部变量
        // 局部变量只在方法中有用
        String name = "王五";
        System.out.println(name+"会吃" + food);
    }
    public  void sleep() {
        System.out.println(name+"会睡觉.....");
    }
}
