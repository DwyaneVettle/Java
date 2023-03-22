package oop;
/*
* 递归
*   需求：啤酒2元1瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶
*       请问10元钱可以喝多少瓶啤酒，剩余多少个空瓶和盖子？
* */
public class Test01 {

    //定义静态成员变量进行统计最后买的啤酒,默认为0
    public static int totalNumber;     //记录买的啤酒
    public static int totalButtle;    //记录上次剩余的瓶子个数
    public static int totalCover;    //记录上次剩余的盖子个数

    public static void main(String[] args) {
        buy(10);
    }
    /**
     * 进行买啤酒
     * @param money
     */
    private static void buy(int money) {
        int buyNumber = money/2;
        totalNumber += buyNumber;

        //记录当前的瓶子个数、盖子个数
        int buttle = totalButtle + buyNumber;
        int cover = totalCover + buyNumber;

        //将当前的瓶子和盖子转换为金钱，利用递归再次购买啤酒
        int allMoney = 0;
        //先判断瓶子和盖子的个数是否满足可以兑换的数量,
        if (buttle >= 2){
            allMoney += (buttle/2) * 2;
        }
        if (cover >= 4){
            allMoney += (cover/4) * 2;
        }

        //并计算当前剩余的瓶子和盖子的数量
        totalButtle = buttle % 2;
        totalCover = cover % 4;

        //进行判断是否进行递归操作
        if (allMoney >= 2){
            buy(allMoney);
        }else {
            System.out.println(totalNumber+"瓶酒\t\t"+totalButtle+"个瓶子\t\t"+totalCover+"个盖子");
        }
    }
}
