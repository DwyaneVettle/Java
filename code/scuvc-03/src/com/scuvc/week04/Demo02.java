package com.scuvc.week04;

import java.sql.SQLOutput;

/**
 * @Description 数组在内存的原理
 * @Author Michealzou@126.com
 * @Date 2026/3/26 16:14
 **/
public class Demo02 {
    public static void main(String[] args) {
        //int[] arr = new int[3];
        //
        //System.out.println(arr[0]);
        //System.out.println(arr[1]);
        //System.out.println(arr[2]);
        //
        //arr[0] = 10;
        //arr[1] = 20;
        //System.out.println(arr[0]);
        //System.out.println(arr[1]);
        //System.out.println(arr[2]);

        int[] arrayA = new int[3];
        arrayA[1] = 10;
        arrayA[2] = 20;

        int[] arrayB = arrayA;
        System.out.println(arrayB[1]);
        arrayB[1] = 100;
        System.out.println(arrayA[1]);
        arrayA[1] = 200;
        System.out.println(arrayB[1]);


    }
}
