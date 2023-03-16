package com.week04;

public class Test02 {
    public static void main(String[] args) {
        Dog d = new Dog(); // 创建对象，对象名字叫d
        d.kind = "中华田园犬";
        d.color = "黑色";
        System.out.println(d.kind + "的颜色为：" + d.color);
        d.shout();
        Dog d2 = new Dog();
        d2.kind = "秋田犬";
        d2.color = "橘色";
        d2.shout();
    }
}
