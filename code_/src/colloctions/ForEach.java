package colloctions;

import java.util.ArrayList;


public class ForEach {

    public static void main(String[] args) {
        // 遍历集合
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("Python");
        list.add("PHP");
        list.add("HTML");
        for (String l :list) {
            System.out.println(l);
        }


        System.out.println("=====");
        list.forEach(obj -> System.out.println(obj));
        System.out.println("=======");
        // 遍历数组
        String[] arr = {"刘德华","张学友","黎明","郭富城"};
        for (String a :arr) {
            System.out.println(a);
        }

    }
}
