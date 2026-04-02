package com.scuvc.week05;

/**
 * @Description
 * @Author Michealzou@126.com
 * @Date 2026/4/2 15:15
 * 构造方法：类提供个其他类或位置创建对象使用的
 *  把类型作为方法名提供
 *  有参构造   无参构造
 *
 **/
public class Demo02 {

    public static void main(String[] args) {
        Person p = new Person();  // 调用了无参构造方法创建对象
        p.setAge(20);
        System.out.println(p.getAge());

        Person p2 = new Person("张三", "男", 20);
        System.out.println(p2.getAge());
        System.out.println(p2.getGender());
        System.out.println(p2.getName());
        // p2.eat(); 私有的方法也不能访问
    }
}
