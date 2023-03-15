package com.week03;



/*
*  练习：定义一个二维数组，每个一维数组内保存班级的分数
*           需求：求每个班级的总分数
*                   求所有班级的总分数
*   Java中除了java.lang包中的所有类不需要导包，其他包都需要导入
* */
public class Demo02 {

    public static void main(String[] args) {
        int[][] arr = {{90,80,56,100},{88,89,90,98},{56,78,90,90,100}};
        int total = 0; // 初始化每个班级的总分
        // 外循环遍历出有几个班级
        for (int i = 0; i < arr.length; i++) {
            // 内循环遍历出每个班级每位同学的分数
            int sum = 0; // 定义sum用来求每个班级的总分数
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("第" + (i+1) + "班级的总分数为：" + sum);
            total = total + sum;
        }
        System.out.println("所有班级的总分数为：" + total);
    }
}
