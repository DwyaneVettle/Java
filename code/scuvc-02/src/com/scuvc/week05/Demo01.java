package com.scuvc.week05;

/*
*  数组array：存放多个元素的容器
*   数组的定义：
*       1.数组存储的数据类型[] 数组名字 = new 数组存储的数据类型[长度];
*       注意：指定数据类型，那么数组里面就必须存放该类型的数据
*           长度必须是整数，长度一旦确定，就不能修改
*           初始默认值：int-0 float-0.0 double-0.0 boolean-false char-\u0000 String-null
* *       2.数组存储的数据类型[] 数组名字 = {元素1，元素2，元素3，...};
*   数组的访问：每一个数组元素都有一个与之所对应的下标，第一个元素的下标为0，依次
*           递增，最后一个元素的下标为数组长度-1
*           数组名[下标]
* */
public class Demo01 {
    public static void main(String[] args) {
        // 第一种定义数组的方式
        int[] arr01 = new int[5];
        // 第二种定义数组的方式
        int[] arr02 = {1,2,3,4,5};

        System.out.println(arr02[2]); // 3

        String[] arr03 = {"张三","李四","王五","赵六"};
        System.out.println(arr03[2]); // 王五
        // 为数组对应下标进行修改或赋值：数组名[下标] = 值
        arr03[1] = "李六";
        System.out.println(arr03);  // [Ljava.lang.String;@776ec8df
        System.out.println(arr03[1]); // 李六
        // System.out.println(arr03[8]);ArrayIndexOutOfBoundsException
        arr03[8] = "王⑦";  // 不能为后续空出多个元素的下标赋值
        // System.out.println(arr03[8]); //
    }
}
