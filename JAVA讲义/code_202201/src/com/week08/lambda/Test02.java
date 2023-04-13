package com.week08.lambda;

public class Test02 {
    public static void main(String[] args) {
        method(() -> {
            System.out.println("hello lambda");
        });

        System.out.println("=======");
        method01(10,20,(num01,num02) -> {
            return num01 + num02;
        });
    }

    public static void method(InterA i) {
        i.print();
    }

    public static void method01(int num1,int num2,InterB b) {
       int result =  b.getSum(num1,num2);
        System.out.println(result);
    }
}
