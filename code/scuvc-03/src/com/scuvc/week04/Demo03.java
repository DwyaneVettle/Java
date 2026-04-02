package com.scuvc.week04;

/**
 * @Description 数组的常见操作
 * @Author Michealzou@126.com
 * @Date 2026/3/26 16:50
 * 1.数组不能越界读取数据，否则会报ArrayIndexOutOfBoundsException异常
 **/
public class Demo03 {

    public static void main(String[] args) {
        int[] arr01 = new int[3];
        // System.out.println(arr01[3]); // ArrayIndexOutOfBoundsException
        // arr01 = null;
        // System.out.println(arr01); // null
        // System.out.println(arr01[0]); // NullPointerException

        // 数组的遍历
        int[] arr02 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr02.length; i++) {
            System.out.println(arr02[i]);
        }

        System.out.println("========");
        // 获取数组中的最大值
        int[] arr = { 5, 15, 2000, 10000, 100, 4000 };
        // 1.定义一个初始化变量arr[0],假设它为最大值
        int max = arr[0];
        // 2.遍历数组，依次取出数组中的元素
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                // 3.把最大值赋值给max
                max = arr[i];
            }
        }
        System.out.println("最大值是：" + max);
        // TODO:如何将数组中的值反转
    }
}
