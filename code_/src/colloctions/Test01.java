package colloctions;

import java.util.TreeSet;

public class Test01 {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<Person>();

        Person p1 = new Person("张三", 20);
        Person p2 = new Person("李四", 22);
        Person p3 = new Person("王五", 24);

        ts.add(p1);
        ts.add(p2);
        ts.add(p3);

        System.out.println(ts);
    }
}
