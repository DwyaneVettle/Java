package lambda;


public class Test02 {

    public static void main(String[] args) {
        method(() -> {
            System.out.println("hello,Lambda");
        });
    }
    
    public static void method(InterA i) {
        i.print();
    }
}
