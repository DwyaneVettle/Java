package duotai;

public class Test {
    public static void main(String[] args) {
        // 父类引用指向子类对象--多态的提现
        Aniaml a = new Dog();
        System.out.println(a.age); // 2-父类的
        a.eat(); // 狗吃肉
    }
}
