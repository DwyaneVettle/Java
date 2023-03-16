package com.ztr.extend;

/**
 * 方法重写：
 *  1.重写发生在继承关系中
 *  2.当父类提供的方法不能满足子类的要求时，就需要对父类的方法进行重写
 **/
public class Demo02 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        Dog d = new Dog();
        d.eat();
    }
}
