package com.scuvc.week05;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description 建100以内随机数组
 * @Author Michealzou@126.com
 * @Date 2026/3/31 14:33
 **/
public class Demo02 {

    public static void main(String[] args) {
        createArray();
    }

    // 建100以内随机数组
    public static void createArray() {
        // 1.定义一个空的数组
        int[] arr = new int[5];
        // 2.遍历0-100以内的数组，随机生成5个
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        // 3.打印数组
        System.out.println(Arrays.toString(arr));
    }
}
