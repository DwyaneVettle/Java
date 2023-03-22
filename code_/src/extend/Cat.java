package extend;

public class Cat extends Animal{
    public Cat() {

    }
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    // @Override强制检查方法是重写的，防止方法名或参数错误
    @Override
    public void eat() {
        // 通过super关键字调用父类成员
        super.eat();
        System.out.println("猫吃鱼。。。");
    }
}
