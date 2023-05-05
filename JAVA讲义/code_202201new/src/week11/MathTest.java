package week11;
/*
*   Math用于做数学运算
* */
public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.PI); // 获取圆周率
        System.out.println(Math.abs(-5)); // 获取对应数值绝对值
        System.out.println(Math.sin(2.2)); // 获取余弦
        System.out.println(Math.cos(2.2)); // 获取正弦
        System.out.println(Math.tan(2.2)); // 获取正切
        System.out.println("========");
        System.out.println(Math.sqrt(6.0)); // 获取平方根
        System.out.println(Math.cbrt(6)); // 获取立方根
        System.out.println(Math.pow(6,3)); // 计算城防
        System.out.println(Math.ceil(6.3)); // 向上取整
        System.out.println(Math.floor(6.3)); // 向下取整
        System.out.println(Math.round(6.6)); // 四舍五入
        System.out.println(Math.max(6.6,7.6)); // 求最大
        System.out.println(Math.min(6.6,7.6)); // 求最小
        System.out.println(Math.random()); // 生成一个(0-1]之间的随机数

        // 需求：生成一个0-10之间的随机整数

        System.out.println(Math.floor((Math.random())*10));

    }
}
