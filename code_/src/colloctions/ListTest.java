package colloctions;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("java");
        list.add(0,"abc"); // 在0索引添加abc,原有元素后移
        list.add(1,"nba"); // 在1索引添加abc,原有元素后移
        System.out.println(list);

        String s = list.get(0);
        System.out.println(s);

        String s1 = list.remove(1);
        System.out.println(list.remove("java"));

        list.set(0,"Python");
        System.out.println(list);

        System.out.println(list.indexOf("Python"));
        list.add("Python");
        System.out.println(list.lastIndexOf("Python"));

        System.out.println(list.subList(0,1));

        Object[] arr = list.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
