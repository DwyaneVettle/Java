package colloctions;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("mysql");
        System.out.println(list);

        Collection<String> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);

        list2.clear();
        System.out.println(list2);

        boolean b = list.remove("mysql");
        System.out.println(b);
        System.out.println(list);

        Collection<String> list3 = new ArrayList<>();
        list3.add("hello");
        list3.add("world");
        list.removeAll(list3); // 将list中包含list3的所有元素删除
        System.out.println(list);

        System.out.println(list.isEmpty());

        System.out.println(list.contains("java"));

        System.out.println(list.containsAll(list3));

        System.out.println(list.size());
    }
}
