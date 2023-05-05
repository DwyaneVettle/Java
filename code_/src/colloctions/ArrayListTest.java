package colloctions;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("php");
        System.out.println(list.size());
        System.out.println(list.get(0));

    }
}
