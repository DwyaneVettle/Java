package API.datatype;

public class Test {

    public static void main(String[] args) {
        Integer i = 5;  // 自动装箱
        System.out.println(i);
        System.out.println(i + 5); // 自动拆箱-将包装类型转为基础类型

        Integer i1 = new Integer(5);
        Integer i2 = new Integer("5");
        System.out.println(i1 + i2); // 10

        int i3 = Integer.parseInt("123");
        System.out.println(i3); // 123
        // int i4 = Integer.parseInt("a123");
        // System.out.println(i4); // NumberFormatException
        // int i5 = Integer.parseInt("123a");
        // System.out.println(i5); // NumberFormatException

    }
}
