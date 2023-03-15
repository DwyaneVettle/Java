package com.week02;
/*
* 冒泡排序:
*   用外循环控制比较的轮数=数组元素个数-1
*   用内循环控制遍历出来的元素，进行比较
* */
public class ArrayTest05 {

    public static void main(String[] args) {
        int[] a = {1,4,6,9,5,8};
        // 外循环
        for (int i = 0; i < a.length - 1; i++) {
            // 内循环
            for (int j = 0; j < a.length - 1 - i; j++) {
                // 比较排序
                if (a[j] > a[j + 1]) {
                    // 定义零时变量(大的那个值)，让它等于数组的第一个元素
                    int temp = a[j];
                    // 将前面大的元素交给后面的空间
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
