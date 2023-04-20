package com.week09;
/*
*  自定义异常：
*       需要通过程序员自己的方式处理异常
*           自己定义异常处理的信息
*   继承异常的父类：Exception或Throwable
*          自定义的异常需要有两个方法：无参构造，有参构造
* */
public class MyException extends Exception{

    public MyException() {}
    public MyException(String msg) {
        super(msg);
    }
}
