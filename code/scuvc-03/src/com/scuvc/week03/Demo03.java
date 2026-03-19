package com.scuvc.week03;

/**
 * @Description
 * @Author Michealzou@126.com
 * @Date 2026/3/19 15:07
 *
 * switch(变量或者表达式){
 *
 *        case 1:
 *
 *        case 2:
 *
 *        case 3:
 *
 * 	case 4:
 *        default:
 * }
 * - 首先计算出表达式的值 ；
 * - 其次，和case依次比较，一旦有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结 束；
 * - 最后，如果所有的case都和表达式的值不匹配，就会执行default语句体部分，然后程序结束掉。
 **/
public class Demo03 {

    public static void main(String[] args) {
        int i = 1;
        switch (i){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
                break;

        }
    }
}
