package com.scuvc.week03;

/*
* 修饰符 返回值类型 方法名(参数) {
	代码;
	return;
}
* 修饰符：public-公共的，private-私有的，protected-受保护的，default-默认的
* 返回值类型:根据功能的实现返回特定的数据的类型，返回的数据是通过return返回的,void不返回返回值
* 方法名：方法的名字，在同一个类中只能出现同一个方法名（重载和重写除外）
* 参数：增加方法的可拓展性:类型 参数名
* 方法的调用：方法名()
* */
public class Demo05 {
    public static void main(String[] args) {
        method1();
        method1();
        method1();
        int i = method2();
        System.out.println(i);
    }

    public static void method1() {
        System.out.println("这是一个方法");
    }

    public static int method2() {
        // return是方法功能的结束，在他的后面不能再出现任何的代码
        return 1;
        //System.out.println("方法结束");

    }
}
