package com.week09;

public class Test03 {
    public static void setAge(int age) throws Exception {
        if (age < 0 || age > 200) {
            System.out.println("年龄不合理");
        } else {
            System.out.println("年龄是：" + age);
        }
    }

    public static void main(String[] args) throws Exception {
        setAge(-20);
    }
}
