package com.week07.inter;

/*
*   抽象方法可以简写： 返回值 方法名();
*    接口就是特殊的抽象类，不能创建对象
*   要实现接口的功能，就需要通过类来实现它，实现的关键字交implements
*
*   实现类去实现接口的同时，必须实现接口中所有的方法
* */
public interface LoadAnimal {

    void run();

    void breath();
}
