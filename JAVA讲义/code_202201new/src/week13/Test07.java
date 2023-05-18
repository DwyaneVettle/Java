package week13;

import java.util.TreeSet;

public class Test07 {

    public static void main(String[] args) {
        Person p1 = new Person("张三", 20);
        Person p2 = new Person("李四", 22);
        Person p3 = new Person("王五", 17);

        // 创建TreeSet对象
        TreeSet<Person> set = new TreeSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(set.toString());

    }
}
