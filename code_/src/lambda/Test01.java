package lambda;

public class Test01 {

    public static void main(String[] args) {
        // 使用匿名内部类
        useAnimal(new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃肉，猫吃鱼，老鼠儿子会打洞。。");
            }
        });
        // 使用Lambda表达式
        useAnimal(() -> {
            System.out.println("狗吃肉，猫吃鱼，老鼠儿子会打洞。。");
        });
    }
    public static void useAnimal(Animal a) {
        a.eat();
    }
}
