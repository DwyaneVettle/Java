package com.week04;

public class Animal {
    String color;
    String name;
    String sex;

    public void eat(String food) {
        System.out.println(name + "爱吃" + food);
    }
    public void sleep() {
        System.out.println(name + "爱睡觉");
    }
}
