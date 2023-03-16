package com.week04;

public class ObjCompare {

    public static void main(String[] args) {
        String c01 = new String("abc");
        String c02 = new String("abc");
        String c03 = c01;
        // 使用==运算符比较
        System.out.println(c02 == c03); // false
        // equals()比较
        System.out.println(c02.equals(c03)); // true
    }
}
