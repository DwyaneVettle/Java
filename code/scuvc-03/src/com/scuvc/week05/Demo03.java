package com.scuvc.week05;

/**
 * @Description 继承
 * @Author Michealzou@126.com
 * @Date 2026/4/2 15:57
 *
 * 继承：子类继承父类，子类可以拥有父类的属性和方法
 *  子类 extends 父类
 *  Python支持多继承，Java只能支持单继承（一个子类只能有一个父类）
 *
 *
 **/
public class Demo03 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(3);
        dog.setName("旺财");
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        dog.eat();
    }
}
