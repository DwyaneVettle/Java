package com.scuvc.week05;

/*
*  类：class + 类名
*  对象：从每一类中分出的具体事物
* */
public class Demo01 {
    /*
    *  对象：具体的事物
    *  创建对象：类型  对象名=new 类名()
    *  通过对象访问成员变量和方法的方式是：对象名.变量/方法名
    *  成员变量赋值：对象名.变量名=值
    * */
    public static void main(String[] args) {
        //Student stu01 = new Student();
        //Student stu02 = new Student();
        //Student stu03 = new Student();
        //Student stu04 = new Student();
        //
        //stu01.name = "张三";  // 赋值
        //System.out.println(stu01.name); // 获取值
        //stu01.study();  // 方法调用

        // 测试
        Phone phone = new Phone();
        System.out.println(phone.brand);  // null
        System.out.println(phone.price);  // 0
        System.out.println(phone.color);  // null
        System.out.println("================");
        phone.brand = "小米";
        phone.price = 1999;
        phone.color = "黑色";
        System.out.println(phone.brand);  // 小米
        System.out.println(phone.price);  // 1999
        System.out.println(phone.color);  // 黑色
        phone.sendMesssage();
        phone.call();
    }
}


