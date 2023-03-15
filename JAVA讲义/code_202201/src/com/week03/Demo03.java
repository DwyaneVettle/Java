package com.week03;

import java.util.Arrays;
import java.util.Objects;

/*
* Arrays
*   toString():返回指定数组的字符串形式
*   sort():对指定数组排序，默认排序方式是升序
*   equals():比较两个数组的内容是否相等
*   binarySearch(数组名,要查找的元素):查找数组中指定元素
*   copyOf():将原有数组复制一份变为一个新的数组
* */
public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,1,7};
        System.out.println(Arrays.toString(arr)); // [3, 2, 4, 5, 1, 7]
        System.out.println("==============");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 7]
        int[] arr02 = {1,2,3,4};
        int[] arr03 = {1,2,3,4};
        System.out.println(Arrays.equals(arr02,arr03)); // true
        /*
        * Arrays.equals():比较的是两个数组的内容相等否
        * equels():两个对象之间进行比较，比较的是地址值
        * */
        String a = "100";
        String b = "100";
        System.out.println(a.hashCode()); // 48625
        System.out.println(b.hashCode());  // 48625
        System.out.println(a.equals(b)); // true
        int c = 100;
        System.out.println(a.equals(c)); // false
        System.out.println("=============");

        int[] arr04 = {3,2,4,5,1,7};
        System.out.println(Arrays.binarySearch(arr04,7)); // 5
        System.out.println(Arrays.binarySearch(arr04,8));  // -7
        int[] arr05 = Arrays.copyOf(arr04,5);
        System.out.println(Arrays.toString(arr05));  // [3, 2, 4, 5, 1]
    }
}
