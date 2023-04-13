package com.week08;
/*
*   多态：对象在调用同一个方法展现的不同的形态
*       前提：1.继承或实现中
*               2.方法的重写
*                   3.父类引用指向子类
* */
public class Animal {

    int age = 2;
    public void eat() {
        System.out.println("动物吃东西。。。");
    }
}
