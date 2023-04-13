package com.week08.innerclass;

public class Test02 {

    public static void main(String[] args) {
        // 匿名内部类
        // 第一种：直接调用
        new Animal() {
            @Override
            void eat() {
                System.out.println("狗吃肉");
            }
        }.eat();

        // 第二种方法：创建对象后调用
        Animal a = new Animal() {
            @Override
            void eat() {
                System.out.println("猫吃鱼");
            }
        };
        a.eat();
    }
}
