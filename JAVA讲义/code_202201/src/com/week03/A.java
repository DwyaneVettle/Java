package com.week03;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三角形的行数：");
        int rows = input.nextInt();
        for(int i = 0;i < rows;i++){
            for(int j = 0; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
