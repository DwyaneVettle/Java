package com.scuvc.week05;

/**
 * @Description 父类
 * @Author Michealzou@126.com
 * @Date 2026/4/2 16:02
 **/
public class Animal {

    private String name;
    private int age;


    // 无参构造
    public Animal() {
    }

    // 有参构造
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + "正在吃");
    }

    public void sleep() {
        System.out.println(name + "正在睡");
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
}
