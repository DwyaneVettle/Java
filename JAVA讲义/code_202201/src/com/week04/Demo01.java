package com.week04;

public class Demo01 {
    /**
     * 此方法用于计算两数相加
     * @param num01 传递的第一个参数
     * @param num02 另一个求和的参数
     * @return 两数之和
     *  方法的返回值会将结果返回到调用的地方
     */
    public static int add(int num01,int num02) {
        return num01 + num02;
    }

    public static void main(String[] args) {
        int sum = add(123,234);
        System.out.println(sum);
    }
}
