package com.week08.lambda;
/*
*   当接口中只有一个抽象方法时，那么这个接口就是函数式接口
*       函数式接口需要用注解@FunctionalInterface标注
*   函数式接口适用lambda表达式
* */
@FunctionalInterface
public interface InterA {
    void print();
}
