package com.scuvc.week05;

/**
 * @Description 一个数组对象的内存图
 * @Author Michealzou@126.com
 * @Date 2026/3/31 15:13
 **/
public class Demo03 {

    public static void main(String[] args) {
        int[] arr01 = new int[3];
        System.out.println(arr01); // 地址值 I@776ec8df
        System.out.println(arr01[0]); // 0
        System.out.println(arr01[1]); // 0
        System.out.println(arr01[2]); // 0

        // 修改数据
        arr01[0] = 10;
        arr01[1] = 20;
        System.out.println(arr01[0]); // 10
        System.out.println(arr01[1]); // 20

        int[] arr02 = arr01;
        arr02[0] = 100;
        System.out.println(arr01[0]); // 100

        System.out.println("======数组的遍历=======");
        int[] arr03 = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr03.length; i++) {
            System.out.println(i);
            System.out.println(arr03[i]);
        }
        System.out.println("============");
        String[] arr04 = {"hello", "world", "你好", "世界"};
        for (int i = 0; i < arr04.length; i++) {
            System.out.println(arr04[i]);
        }

        // 练习：找出数组中的最大值
        int[] arr05 = {33, 65, 76, 12, 88};
        // 1.假设第一个元素为最大值
        int max = arr05[0];
        // 2.遍历数组
        for (int i = 0; i < arr05.length; i++) {
            if (arr05[i] > max) {
                max = arr05[i];
            }

        }
        System.out.println("数组arr05的最大值是：" + max);
    }
}
