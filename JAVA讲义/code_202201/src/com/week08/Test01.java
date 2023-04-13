package com.week08;

/*
*   多态中成员访问的特点：
*       成员变量：编译看父类，访问的是父类的成员变量
*       成员方法：编译看父类，运行看子类
* */
public class Test01 {
    public static void main(String[] args) {
        // 父类引用指向子类
         Animal d = new Dog();
         Animal c = new Cat();
         System.out.println( d.age); // 2
         d.eat();

        System.out.println(c.age);
        c.eat();

    }
}
