package com.scuvc.week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
*  数组(array)的定义：
*   1.数组存储的数据类型[] 数组名字 = new 数组存储的数据类型[长度];
*   2.数据类型[] 数组名 = {元素1,元素2,元素3...};
* 数组元素的查找（索引）：
*   数组名[索引]，索引：每一个元素都有一个下标，从第一个元素为0开始，直到最后一个元素
*                   n-1结束
*  数组的包装类型：Arrays
* */
public class Demo01 {

    public static void main(String[] args) {
        // 1.定义具有初始化长度的数组
        int[] arr01 = new int[5];

        // 2.定义具有初始化元素的数组
        String[] arr02 = {"张三","李四","王五", "赵六", "钱七"};

        // 查找元素
        System.out.println(arr02[1]);

        // 随机数生成
        System.out.println(Math.random());


        // 创建100以内随机数组，数组长度为5
        createRandomArray();
        //int num = new Random().nextInt(100);
        //System.out.println(num);
        System.out.println("=======");
        test01(); // [I@41629346
     }

     public static void createRandomArray() {
            // 1.定义初始化数组
            int[] arr = new int[5];
            // 2.循环遍历0-100的数值
            for (int i = 0; i < arr.length ; i++) {
              // 3.随机数生成
                int num = new Random().nextInt(100);
                arr[i] = num;
            }
         System.out.println(Arrays.toString(arr));
     }

     public  static void test01() {
         int[] arr = new int[5];
         System.out.println(arr);
         System.out.println(Arrays.toString(arr));
     }
}
