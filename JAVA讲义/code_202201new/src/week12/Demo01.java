package week12;
/*
*   包装类：8大基础数据类型它不支持面向对象的思维
*       包装类解决了这个问题，让基本数据类型也能创建对象
*       基本数据类型首字母大写--包装类
*           例外：int---Integer   char---Character
*
*   所有的包装类型都有一个parseXXX(),将对象到字符串解析为XXX的类型
* */
public class Demo01 {
    public static void main(String[] args) {
        // 创建对象
        Integer i1 = new Integer(123); // 参数为Number
        Integer i2 = new Integer("123"); // 参数为String
        System.out.println(i1);
        System.out.println(i2);

        // 属性
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.TYPE);

        // 方法
        // parseInt()-将字符串参数解析为整数
        int i = Integer.parseInt("456");
        System.out.println(i);
        // valueOf()-将字符串参数解析为整数
        // valueOf()是通过Integer具有常量池中获取(-128-127)
        Integer i3 = Integer.valueOf("123");
        System.out.println(i3);

        /*
        * JDK1.5之后新增了拆装箱
        *   自动装箱：将基础数据类型转为包装类型
        *   自动拆箱：将包装类型转为基础数据类型
        * */
        Integer i5 = 5;  // 装箱
        System.out.println(i5 + 5); // 拆箱
    }
}
