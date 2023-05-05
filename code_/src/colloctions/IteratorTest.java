package colloctions;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        // 迭代器可以单独拿到某一个元素
        Iterator<Object> it = list.iterator();
        /*System.out.println(it.next()); // aaa
        System.out.println("====");
        while(it.hasNext()) {
            System.out.println(it.next()); // bbb ccc ddd
        }*/
        // 移除元素
        while(it.hasNext()) {
            Object obj = it.next();
            if(obj.equals("bbb")) {
                // list.remove(obj); // 并发修改异常ConcurrentModificationException
                it.remove();
            }
            System.out.println(list);
        }
    }
}
