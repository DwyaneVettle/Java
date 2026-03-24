package com.scuvc.week04;

import java.util.Scanner;

/*
*  条件语句
* 单分支：

if(判断条件){

       代码。。。

}

多分支：

if(判断条件){

       代码1。。。

}else{

       代码2。。。

}

嵌套分支：

if(判断条件1){

       代码1。。。

}else if(条件2){

       代码2。。。

} else if(判断条件3){

       代码3。。。

}else{

       代码4。。。

}
* */
public class Demo01 {

    public static void main(String[] args) {
        /*
        *  通过用户输入金额，根据购物金额实现打折
        *   大于1000，0.9
        *   大于2000，0.8
        *   大于5000，0，5
        * */
        // 接收用户输入的购物金额
        System.out.println("请输入购物金额：");
        int money = new Scanner(System.in).nextInt();
        if (2000 >= money  && money > 1000) {
            int discount = money * 9 / 10;
            System.out.println("实际支付金额为：" + discount);
        } else if (money <= 5000 && money > 2000) {
            int discount = money * 8 / 10;
            System.out.println("实际支付金额为：" + discount);
        } else if (money > 5000) {
            int discount = money * 5 / 10;
            System.out.println("实际支付金额为：" + discount);
        } else {
            System.out.println("实际支付金额为：" + money);
        }
    }
}
