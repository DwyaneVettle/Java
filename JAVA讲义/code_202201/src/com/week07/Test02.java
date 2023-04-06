package com.week07;

public class Test02 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Moto moto = new Moto();
        bus.drive();
        moto.drive();
        // 抽象类不能创建对象
        // Car car = new Car();
    }
}
