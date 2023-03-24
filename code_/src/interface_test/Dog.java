package interface_test;

public class Dog implements Animal,LandAnimal{
    @Override
    public void breath() {
        System.out.println("狗在呼吸。。。");
    }

    @Override
    public void getType(String type) {
        Animal.super.getType(type);
    }

    @Override
    public void run() {
        System.out.println("狗可以跑。。");
    }
}
