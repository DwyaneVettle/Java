package com.week05;
/*
*   构造方法：实例化对象的时候，给属性赋值，调用构造方法
*       声明格式：public 类名() {}
*   注意：1.构造方法必须和类名相同
*          2.构造方法中没有返回值类型，void也不行
*           3.构造方法中没有return语句
*               4.每一个类都有一个默认的无参构造，所以不需要手动书写
*                   要书写的情况：创建一个没有初始属性值的对象 Person p = new Person();
* */
public class Person {

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 属性==成员变量
    private String name; // 姓名
    /*
    *   成员变量可以通过对象进行赋值，但是对象可以随意更改
    *   这个时候怎么办？
    *           面向对象特征之一---封装
    *           封装的关键字：private
    *       封装之后的属性或行为，别的类就不能使用了，如果想要使用？
    *           给封装后的属性提供一个公共的方法进行访问
    * */
    private int age; // 年龄

    // 提供公有的方法访问age  --》 设置年龄，获取年龄
    // 设置值
    public void setAge(int a) {
        if (a < 0 || a > 150) {
            System.out.println("你设置的年龄不合法");
        }
        age = a;
    }

    // 获取值
    public int getAge() {
        return age;
    }

    // 设置姓名的公共方法
    public void setName(String n) {
        name = n;
    }

    // 获取姓名的公共方法
    public String getName() {
        return name;
    }


    // 行为 = 成员方法
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}
