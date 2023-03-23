package com.week05;
/*
* 方法重载：
*       方法名相同，只是根据业务逻辑的不同，参数列表（个数、类型）不同
* */
public class Test03 {

    public static void main(String[] args) {
        int sum = getSum(5,7);
        System.out.println(sum);

        int sum01 = getSum(5,6,7);
        System.out.println(sum01);

        getSum(1,2,3,4);
    }
    /*
     *  需求:定义一个求两数之和的方法
            1.见名知义的方法名
            2.明确返回值类型


     */
    public static int getSum(int num01,int num02) {
            int sum = num01 + num02;
            return sum;
    }


    /*
    *  需求： 定义一个求三个数相加的方法
    * */
    public static int getSum(int num01,int num02,int num03) {
        int sum = num01 + num02 + num03;
        return sum;
    }

    public static int getSum(int num01,int num02,int num03,int num04) {
        int sum = num01 + num02 + num03 + num04;
        return sum;
    }

}
