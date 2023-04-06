package com.week07;
/*
*  final关键可以修饰类、变量、方法
*       被修饰的类不能被继承
*       被修饰的方法不能被重写
*       被修饰的变量不能修改
* */
public abstract class Animal extends Object{
    private String name;
    private int age;


    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void eat() {
        System.out.println("动物可以吃。。。");
    }


    public abstract void sleep();
}

