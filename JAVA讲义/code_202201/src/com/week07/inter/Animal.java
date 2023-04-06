package com.week07.inter;

/*
*  接口通过关键字interface定义
*       在jdk8之前接口内部必须全部是抽象方法，8之后接口可以有变量、常量、普通方法
*           静态方法
*
* */
public interface Animal {

    // 抽象方法
    public abstract void breath();

    // 变量、常量
    final static int A = 10;

    // 普通方法
    public default void method01() {

    }
    // 静态方法
    public static void method02() {

    }

}
