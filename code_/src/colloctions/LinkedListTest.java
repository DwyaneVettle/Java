package colloctions;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add("java");
        list.add("python");
        System.out.println(list);

        list.addFirst("HTML");
        list.addLast("Mysql");
        System.out.println(list);

        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
