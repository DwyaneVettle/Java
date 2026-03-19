package com.scuvc.week03;

import java.util.Scanner;

/**
 * @Description 用于演示条件语句
 * @Author Michealzou@126.com
 * @Date 2026/3/19 14:20
 * 单分支：
 *
 * if(判断条件){
 *
 *        代码。。。
 *
 * }
 *
 * 多分支：
 *
 * if(判断条件){
 *
 *        代码1。。。
 *
 * }else{
 *
 *        代码2。。。
 *
 * }
 *
 * 嵌套分支：
 *
 * if(判断条件1){
 *
 *        代码1。。。
 *
 * }else if(条件2){
 *
 *        代码2。。。
 *
 * } else if(判断条件3){
 *
 *        代码3。。。
 *
 * }else{
 *
 *        代码4。。。
 *
 * }
 **/
public class Demo01 {

    public static void main(String[] args) {
        /*
        * 超市购物打折：
        * 当购物超过2，超过1000元，打95折，超过500元且为会员卡打89折00元且为会员卡打80折，超过且为会员卡2000元打75折
        *
        * */
        System.out.println("请输入购物金额：");
        int money = new Scanner(System.in).nextInt();
        boolean flag = true; // 是否为会员卡
        if (money > 2000){
            System.out.println("打8折,折后价格为：" + money * 0.8);
        } else if (money > 1000){
            System.out.println("打85折,折后价格为：" + money * 0.85);
        } else if (money > 500){
            System.out.println("打9折,折后价格为：" + money * 0.9);
        } else if (money > 200){
            System.out.println("打95折,折后价格为：" + money * 0.95);
        } else {
            System.out.println("谢谢惠顾");
        }

    }

}
