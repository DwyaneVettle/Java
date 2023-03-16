package com.week04;

import java.util.Scanner;

public class Demo02 {

    public static void mul(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
    public static void star() {
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
    public static void main(String[] args) {

        mul();
        star();
    }
}
