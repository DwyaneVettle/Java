package extend;
/*
* 测试继承
* */
public class Demo01 {
    public static void main(String[] args) {
        // 创建猫类
        Cat cat = new Cat();
        cat.setName("波斯猫");
        cat.setAge(4);
        cat.setColor("红色");
        cat.eat();
        System.out.println("猫的种类是"+cat.getName()+",年龄是：" + cat.getAge()+",颜色是：" +cat.getColor());
    }
}
