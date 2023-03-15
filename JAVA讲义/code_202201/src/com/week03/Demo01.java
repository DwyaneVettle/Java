package com.week03;

import java.util.Arrays;

/*
*  演示多维数组的创建
*   创建： 1.动态初始化：数据类型[][] 数组名 = new 数据类型[][]
*         2.静态初始化：数据类型[][] 数组名 = { {},{}... }
* */
public class Demo01 {

    public static void main(String[] args) {
        int[][] arr01 = {{1,2},{3,4},{4,5}};
        // 通过索引-获取到二维数组内的数组
        System.out.println(arr01[0]);  // [I@1b6d3586
        System.out.println(Arrays.toString(arr01[0])); // [1, 2]
        // 通过索引-获取到二维数组内的数组的元素
        System.out.println(arr01[0][0]);

        // 练习：获取{2,4,6,8}元素8
        int[][][] arr02 = {{{6,7,8},{1,2,3}},{{4,5,6},{2,4,6,8}}};
        System.out.println(arr02[1][1][3]);
    }
}
