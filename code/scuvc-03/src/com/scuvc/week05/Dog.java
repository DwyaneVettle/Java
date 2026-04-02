package com.scuvc.week05;

/**
 * @Description 子类
 * @Author Michealzou@126.com
 * @Date 2026/4/2 16:04
 **/
public class Dog extends Animal {
   // 在继承后，可以访问父类的共有属性和方法

    // 方法的重写：当父类的方法不支持子类拓展时，子类可以创建自己的方法，并且保留相同的方法名

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
        // super.eat();  // super表示对父类的引用
    }
}
