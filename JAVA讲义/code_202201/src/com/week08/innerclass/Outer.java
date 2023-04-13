package com.week08.innerclass;
// Outer是外部类
public  class Outer {
    int outer = 10;
    public void outerMethod() {
        System.out.println("这是外部类的方法。。。。");
    }
    // 成员内部类
    class Inner {
        int inner = 20;
        public void innerMethod() {
            System.out.println("这是内部类的方法。。。");
        }
    }
    /*
    * 局部内部类 - 就是在外部类中的方法中声明类
    *   局部内部类的局限非常大,因为局部内部类只能在该类所在的方法中去创建对象
    *  */
    public void method01() {
            class Inner01 {
                int inner01 = 30;
                public void inner_method01() {
                    System.out.println("这是局部内部类的方法。。。");
                }
            }
    }

    // 静态内部类
    // 静态内部类不能使用外部类的成员，因为一切的静态资源都是先存在的。
    // 如果要访问外部类的成员，那么外部类也必须是静态的
    static class Inner02 {
        int inner02 = 40;
        public void method02() {
            System.out.println("这是静态内部类的方法。。。");
            // System.out.println(outer);
        }
    }
}
