package com.week04;
/*
*   创建人物对象
* */
public class Object {

    public static void main(String[] args) {
        // 创建对象：new 类名()
        // 对象名为p，对象类型为Person
        Person p = new Person();
        // 调用类的属性和方法通过对象名.属性/行为
        System.out.println(p.name); // null
        System.out.println(p.age);
        // 为对象的属性设置值
        p.name = "张三";
        System.out.println(p.name);
        p.age = 20;
        System.out.println(p.age);
        // 调用行为：对姓名.行为方法()
        p.eat("香蕉");
        p.sleep();

        /*
        * 创建对象，名字为李四，年龄为50，并调用吃饭睡觉的方法
        * */
        Person p01 = new Person();
        p01.name = "李四";
        p01.age = 50;
        p01.sleep();
        p01.eat("苹果");
    }
}
