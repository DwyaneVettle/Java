package com.week09;

/*
 *  回收垃圾分为手动和自动：
 *      自动的方式是通过JVM来完成
 *      手动:
 *          1.System.gc()
 *          2.Runtime.getRuntime().gc()
 *  手动垃圾回收充满不确定性：当垃圾回收后，不确定后面的代码是否执行
 *      一般情况下，不需要成需要做手动垃圾回收，而是通过JVM来自己判断是否需要回收
 *          垃圾
 * */
public class Test04 {
    public static void main(String[] args) {
        method01();
        System.out.println("==============");
        method02();
    }

    public static void method01() {
        Person p = new Person();
        System.out.println(p);
        // 让p变为垃圾
        p = null;
        for (int i = 0; i < 10; i++) {
            System.out.println("aaa");
        }
    }

    public static void method02() {
        Person p = new Person();
        System.out.println(p);
        // 让p变为垃圾
        p = null;
        // System.gc();
        Runtime.getRuntime().gc();
        System.out.println(p);
        for (int i = 0; i < 10; i++) {
            System.out.println("bbb");
        }
    }
}
