package com.week06;

public class Test05 {
    public static void main(String[] args) {
        // 创建猫的对象
        Cat cat = new Cat();
        // 子类对象cat，使用父类属性或方法
        cat.setName("橘猫");
        cat.setAge(3);
        cat.setColor("橘色");
        cat.eat();
        System.out.println("猫的品种是：" + cat.getName() +
                            "猫的年龄是：" + cat.getAge() +
                            "猫的颜色为：" + cat.getColor());


        // 练习： 创建一个狗对象，狗的品种为“中华田园”,年龄5，颜色“红色”
        Dog dog = new Dog();
        dog.setName("中华田园犬");
        dog.setAge(5);
        dog.setColor("红色");
        System.out.println(dog.getName()+""+dog.getAge()+""+dog.getColor());

    }
}
