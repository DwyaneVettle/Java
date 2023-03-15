package com.week02;
/*
*  求数组中的最大值
*       1.假定某一个元素为最大元素
*       2.让其他元素和该元素比较，有比该元素大的，存起来
*       3.将最大元素赋值给假定元素
* */
public class ArrayTest04 {

    public static void main(String[] args) {
        int[] arr = {233,6798,56,12,9,123,456,800};
        // 1.假设最大元素是arr的第一个元素
        int max = arr[0];
        // 2.遍历数组，将所有元素取出来
        for (int i = 0; i < arr.length; i++) {
            // 3.让最大元素和数组中的元素一一比较，将数组最大元素交给max
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
