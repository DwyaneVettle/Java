package com.week03;
/*
* 方法：一段代码块{}
*   提高代码的复用性，增加代码的灵活性
*   执行：1.定义方法
*          2.调用方法    通过方法名()
*             3.执行完毕，销毁
* 修饰符  返回值  方法名(【参数】) {
    方法体；
}
*   当方法执行完毕后，就会立即被销毁
*   销毁的前提是看方法有没有再被引用，如果还有引用，再次调用方法
*   引用计数器：记录一个变量被引用的次数，销毁即引用计数器变为了0
*   《深入理解JVM》
* */
public class Demo04 {

    public static void main(String[] args) {
        System.out.println("这是程序的主方法。。。");
        // 2.调用方法：
        test01();
        test01();

    }
    // 1.定义方法
    public static void test01() {
        System.out.println("test01方法执行了。。。。");
    }
}
