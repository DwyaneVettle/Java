package lambda;

public class Test03 {
    public static void main(String[] args) {
        method(10,20,(num1,num2) -> {
            return num1 + num2;
        });
    }
    public static void method(int num1,int num2,InterB i) {
        int result = i.getSum(num1,num2);
        System.out.println(result);
    }
}
