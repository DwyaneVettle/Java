package class_in_class;
/*
*   创建内部类对象的格式：外部类.内部类 对象名 = new 外部类对象().new 内部类对象()
*       内部类可以访问内部类的成员
* */
public class Test01 {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.innerMethod();
        System.out.println(oi.inner);
    }
}
