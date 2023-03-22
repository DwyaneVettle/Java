package Object;

public class Demo01 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p); // 包名+类名+地址值
        System.out.println(p.toString());
        System.out.println(p.getClass()); // class Object.Person

    }
}
