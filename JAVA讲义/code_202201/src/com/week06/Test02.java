package com.week06;
/*
*  在普通方法内不能使用static定义变量或常量
* */
public class Test02 {

    public  void method01() {
            // static int a; // 不能由static修饰
    }

    // 静态代码块:定义类时就有的一段代码空间，创建对象，直接执行静态代码块
    // 静态代码块只执行一次
    static {
        System.out.println("我是静态代码块。。。。");
    }
}

class  Test03 {
    public static void main(String[] args) {
        Test02 t02 = new Test02();
        Test02 t03 = new Test02();
    }
}
