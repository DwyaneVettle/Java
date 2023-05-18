package week13;

import java.util.LinkedList;

/*
*  LinkedList:双向循环链表
*       查询慢，增删块
* - `getFirst()` ：返回此列表的第一个元素
    - `getLast()` ：返回此列表的最后一个元素
    - `addFirst(E e)` ：在列表开头插入指定元素
    - `addLast(E e)` ：追加元素到列表末尾
    - `removeFirst()` ：移除列表第一个元素
    - `removeLast()` ：移除列表最后一个元素
    - `offer(E e)`：将指定元素添加到列表尾部
    - `offerFirst(E e)` ：在列表前面插入元素
    - `offerLast(E e)` ：在列表末尾插入指定元素
* */
public class Test03 {

    public static void main(String[] args) {
        // 创建LinkedList对象
        LinkedList<String> list = new LinkedList<>();
        list.add("java");
        list.add("mysql");
        list.add("python");
        list.add("html");
        System.out.println(list.getFirst()); // 获取第一个元素
        System.out.println(list.getLast()); // 获取最后一个元素

        list.addFirst("杜鑫");
        System.out.println(list.getFirst());

        list.offerLast("abc");
        System.out.println(list); // [杜鑫, java, mysql, python, html, abc]
    }
}
