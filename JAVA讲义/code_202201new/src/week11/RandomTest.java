package week11;

import java.util.Random;

/*
* Random用于生成不同类型的指定区间的随机数
* */
public class RandomTest {
    public static void main(String[] args) {

        // 创建对象
        Random rd = new Random();
        System.out.println(rd.nextBoolean());
        System.out.println(rd.nextDouble());
        System.out.println(rd.nextInt());
        System.out.println(rd.nextFloat());
        System.out.println(rd.nextInt(100)); // 生成0-100之间的随机数

    }
}
