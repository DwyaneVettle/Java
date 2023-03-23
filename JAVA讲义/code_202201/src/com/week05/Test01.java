package com.week05;

public class Test01 {

    public static void main(String[] args) {
        /*
            创建对象,对象名字自己起，见名知义
            对象名：p
            初始化： 创建一个没有任何属性的对象
            实例化： 创建有默认值的属性的对象
        * */
        Person p = new Person();

        Person p01 = new Person("李四", 20);
        // 使用属性和行为 --> 对象名.属性/方法名()
        // p.age = -20;
        p.setAge(20);
        p.setName("张三");
        System.out.println("姓名是：" + p.getName() + "，年龄是" + p.getAge());
        p.eat();
        p.sleep();
        /*Person p01 = new Person();
        p01.age = -100;*/
    }
}
