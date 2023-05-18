package week13;

import java.util.ArrayList;
import java.util.Iterator;

/*
    Iterator 迭代器
        hasNext():获取是否有下一个
        next()：获取下一个
        remove():移除最后一个
* */
public class Test04 {

    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        // 创建迭代器对象 list.iterator()
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            // 移除remove()
            if(next.equals("ccc")) {
                it.remove();
            }
            System.out.println(next);
        }
    }
}
