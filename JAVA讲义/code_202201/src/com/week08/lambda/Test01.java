package com.week08.lambda;

/*
*   lambda表达式格式
*           (数据类型 参数1,数据类型 参数2...) -> {}
*
* */


public class Test01 {

    // 使用方法调用Animal中的eat()
    public static void useAnimal(Animal a) {
        a.eat();
    }

    public static void main(String[] args) {
        // 匿名内部类的方式
        /*useAnimal(new Animal() {
            @Override
            public void eat() {
                System.out.println("猫吃鱼，狗吃肉，老鼠的儿子会打洞！");
            }
        });*/
        // lambda方式
        useAnimal(() -> {
            System.out.println("猫吃鱼，狗吃肉，老鼠的儿子会打洞！");
        } );

    }
}
