package com.week07.inter;

import java.sql.SQLOutput;

// 实现类去实现接口的同时，必须实现接口中所有的方法
public class Dog implements LoadAnimal{

    @Override
    public void run() {
        System.out.println("狗在跑。。。。");
    }

    @Override
    public void breath() {
        System.out.println("狗可以呼吸。。。");
    }
}
