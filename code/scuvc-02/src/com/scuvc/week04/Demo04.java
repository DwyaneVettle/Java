package com.scuvc.week04;

/*
* for(开始条件1；循环条件2；更改条件4){
       循环体代码3…
}
* 执行流程：
*   1.先执行开始条件1
*   2.判断循环条件2是否成立，如果成立，则执行循环体代码3，然后执行更改条件4
*   3.再次判断循环条件2是否成立，如果成立，则执行循环体代码3，然后执行更改条件4
* *   4.重复步骤3，直到循环条件2不成立为止
* */
public class Demo04 {

    public static void main(String[] args) {
        //for (int i = 0;i <= 10;i++) {
        //    System.out.println("i = " + i);
        //}

        // 从10-0
        for (int i = 10;i >= 0;i--) {
            System.out.println("i = " + i);
        }
    }
}
