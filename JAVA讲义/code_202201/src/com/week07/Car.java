package com.week07;

/*
 *   当父类的方法，子类实现功能不一样时，可以将这个方法作为一个抽象方法
 *   抽象方法用abstract修饰
 *   如果一个类中有抽象方法，那么这个类就一定是抽象类
 *   抽象方法没有方法体
 *   抽象方法必须重写或实现
 *  抽象方法需要子类实现
 * */
public abstract class Car {


    public abstract void drive();
}
