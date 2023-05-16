package week12;

import java.util.ArrayList;
import java.util.Collection;

/*
*   Collection--单列集合的根类
*   <> 泛型：规定该对象所能使用的类型
* */
public class Demo06 {

    public static void main(String[] args) {
        // 创建Collection对象--通过子类
        Collection<String> list = new ArrayList<>();
        // add()向集合中添加单个元素
        list.add("abc");
        list.add("java");
        list.add("Python");
        list.add("Mysql");
        System.out.println(list);

        // addAll()向集合中添加一个集合
        Collection<String> list02 = new ArrayList<>();
        list02.add("PHP");
        list02.add("HTML");
        list.addAll(list02);
        System.out.println(list);

        // clear()清空集合
        list02.clear();
        System.out.println(list02);

        // remove()移除元素
        list.remove("abc");
        System.out.println(list);

        // removeAll()移除集合中的集合
        Collection<String> list03 = new ArrayList<>();
        list03.add("java");
        list03.add("Python");
        list.removeAll(list03);
        System.out.println(list);

        // isEmpty()判断集合是否为空
        System.out.println(list.isEmpty()); // false

        // contains(Object o)判断集合是否包含o
        System.out.println(list.contains("java")); // false

        // containsAll(Collection c)判断集合是否包含集合
        System.out.println(list.containsAll(list02)); // true

        // size()集合的长度
        System.out.println(list.size()); // 3
    }
}
