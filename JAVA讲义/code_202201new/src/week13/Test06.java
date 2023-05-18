package week13;

import java.util.HashSet;

/*
*   HashSet:不重复、无序集合
*       添加元素时，会调用hashCode()方法，再把哈希值通过equals()方法进行比较
* */
public class Test06 {
    public static void main(String[] args) {
        // 1.创建HashSet对象
        HashSet<String> set = new HashSet<>();

        set.add("java");
        set.add("python");
        // set.add("python"); 不能添加重复元素，如强制添加，只会保留一个
        System.out.println(set);
        // 遍历
        set.forEach(a -> System.out.println(a));
    }
}
