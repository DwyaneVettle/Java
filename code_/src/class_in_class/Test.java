package class_in_class;

import abstract_test.Animal;

public class Test {

    public static void main(String[] args) {
        // 等效于Animal父类的子类对象
        // 第一种直接调用方式
        /*new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃肉");
            }
        }.eat();*/
        // 第二种返回对象调用
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃肉");
            }
        };
        a.eat();
    }
}
