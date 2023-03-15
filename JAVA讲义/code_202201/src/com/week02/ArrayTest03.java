package com.week02;

import java.util.Arrays;
import java.util.Random;

/*
* 需求：创建一个随机数组
*   随机数的API：Random
*   new Random().nextInt(数据区间)
* */
public class ArrayTest03 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(34);
        }
        System.out.println(Arrays.toString(arr));
    }
}
