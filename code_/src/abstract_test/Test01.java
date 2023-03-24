package abstract_test;

public class Test01 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();

        System.out.println("=======");

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();


    }
}
