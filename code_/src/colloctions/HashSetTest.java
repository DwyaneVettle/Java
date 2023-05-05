package colloctions;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("java"); // 不存储重复元素
        System.out.println(set); // [world, java, hello]
        // System.out.println(set.hashCode());
        set.forEach(str -> System.out.println(str));
    }
}
