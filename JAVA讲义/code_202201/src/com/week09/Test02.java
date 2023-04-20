package com.week09;

/*
*   throws用于抛出一个或多个异常，多个异常之间用逗号隔开,一般用在方法名后
*   throw用于抛出一个异常，一般用于方法体中
* */
public class Test02 {

    public static void main(String[] args) throws MyException {
        divide(10,0);

    }
    public static void divide(int num01,int num02) throws MyException {
        if(num02 == 0) {
            // 抛出自定义的异常
            throw new MyException("除数为0不得行！！！");
        } else {
            System.out.println(num01 / num02);
        }

    }
}
