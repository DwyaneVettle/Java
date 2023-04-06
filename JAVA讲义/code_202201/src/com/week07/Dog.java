package com.week07;
/*
*  方法的重写：
*       前提：建立在继承关系上
*        子类调用重写后的方法优先调用自己身上的
*       为什么要重写方法？ --- 当父类的方法中的功能不能满足子类时，子类就可以重写父类的方法
*       重写后的方法需要用注解@Override修饰
*   super:
*       在重写方法后，如果子类还想用父类的成员，那么可以使用super进行访问
* */
public class Dog extends Animal{

    public Dog() {}
    public Dog(String name,int age) {
        super(name,age);
    }
    @Override
    public void eat() {
        System.out.println("狗吃肉。。。");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println("狗晚上不睡觉。。");
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("土狗");
        dog.setAge(20);
        System.out.println("狗的品种为：" + dog.getName() +
                ",狗的年龄是：" + dog.getAge());
        dog.eat();
        dog.sleep();
    }
}