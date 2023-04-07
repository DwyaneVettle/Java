package exception;


public class Test04 {
    public static void main(String[] args) {
        method01();
        method02();
    }
    
    public static void method01() {
        Person p = new Person();
        p = null; // 置为null,让其变为垃圾
        for (int i=1;i<=10;i++) {
            System.out.println("aaa");
        }   
    }
    public static void method02() {
        Person p = new Person();
        p = null; // 置为null,让其变为垃圾
        // System.gc();
        Runtime.getRuntime().gc();
        for (int i=1;i<=10;i++) {
            System.out.println("bbb");
        }
    } 
}
