package com.week06;
/*
* 回顾上周知识点*/
public class Demo01 {

    // 构造方法的方法名：类名()
    // 创建对象要调用构造方法
    public  Demo01() {
        System.out.println("这个对象是d:" + this);
    }

    // 有参构造
    public Demo01(String name) {
        this.name = name;
        System.out.println("这个对象是d01:" + this);
    }



    private String name;


    private static  void method() {
        System.out.println("这是私有的方法。。。");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        method();
    }
}

class Test01 {
    public static void main(String[] args) {
        Demo01 d = new Demo01();
        System.out.println(d);
        Demo01 d01 = new Demo01("hello");
        System.out.println(d01);
        d.setName("abc");
        System.out.println(d.getName());

    }
}
