package class_in_class;

public class Test02 {
    public static void main(String[] args) {
        Outer.Inner02 oi = new Outer.Inner02();
        System.out.println(oi.inner02);
        oi.method03();
    }
}
