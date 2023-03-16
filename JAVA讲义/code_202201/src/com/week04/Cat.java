package com.week04;

public class Cat {

    public static void main(String[] args) {
        // 创建对象cat
        Animal cat = new Animal();
        // 为对象添加属性值
        cat.color = "黄色";
        cat.name = "橘猫";
        cat.sex = "公";
        // 调用对象行为
        cat.eat("🐟");
        cat.sleep();
        System.out.println("猫的品种为：" + cat.name + "颜色为：" +
                cat.color + "性别为：" + cat.sex);
    }
}
