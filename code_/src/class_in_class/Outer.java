package class_in_class;
// 成员内部类
public class Outer {
    // 外部类的成员变量和方法
    int outer = 10;
    public void outerMethod() {
        System.out.println("我是外部类方法。");
    }

    public void method01() {
        class Inner01 {
            int inner01 = 30;
            public void method02() {
                System.out.println("局部内部类的方法。");
            }
        }
    }
    // 成员内部类
    class Inner {
        // 内部类的成员变量和方法
        int inner = 20;
        public void innerMethod() {
            System.out.println("我是内部类的方法。。");
            System.out.println(outer);
            outerMethod();
        }
    }

    static class Inner02 {
        int inner02 = 40;
        public void method03() {
            System.out.println("静态内部类方法" + inner02);
            // System.out.println(outer);不能使用外部类，静态类先存在，如果要访问，必须将外部变量设置为静态
        }
    }
}
