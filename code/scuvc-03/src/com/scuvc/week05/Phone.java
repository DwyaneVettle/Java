package com.scuvc.week05;

/**
 * @Description 面向对象的练习-内存图
 * @Author Michealzou@126.com
 * @Date 2026/4/2 14:34
 **/
public class Phone {

    public String brand;
    int price;
    String color;
    String model = "飞行模式";
    public void call() {
        long number = 13000000000L;  // 局部变量
        System.out.println("正在给" + number + "打电话");
        System.out.println("当前正处于" + model + "模式");
    }

    public void sendMesssage() {
        System.out.println("正在发送短信");
    }

    public static void main(String[] args) {
        System.out.println();
    }


}
