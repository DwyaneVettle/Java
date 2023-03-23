package com.week05;
/*
*   递归：因为业务逻辑的特殊性，需要在方法内部调用自己
*       public static void test() { test()}
*       注意：必须要有结束的条件，递归的次数不能过多（内存溢出）
* */
public class Test05 {

    public static void main(String[] args) {
        int sum = getSum(5);
        System.out.println(sum);
    }
    /*
    *  需求：定义一个方法，求5-1之间所有数字之和
    *       5+4+3+2+1
    *               5+(4-1以内的和) + 4+ (3-1以内的和)....
    * */
    public static int getSum(int num) {
            if (num == 1) {
                return 1;
            }
            return num + getSum(num - 1);
    }

}
