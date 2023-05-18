package week13;


import java.util.ArrayList;
import java.util.List;

/*
*   List接口是存储元素的一个容器，特点：1.存取有序；2.每一个对应元素都有下标；3.可以存储重复元素
*       子类：ArrayList,LinkedList
*       每一个元素都有下标：0-n-1
*   重载：方法名相同，参数的类型或个数不通
*   重写：在继承关系中，对父类的方法重写构造，方法名相同，参数相同，方法体不通
* */
public class Test01 {
    public static void main(String[] args) {
        // 创建List对象
        /*
        * <>：泛型：指定该集合存储的数据类型
        * */
        List<String> list01 = new ArrayList<String>();
        // add()向集合中添加元素
        list01.add("123");
        list01.add("java");
        list01.add("mysql");
        // size() - 集合长度
        System.out.println(list01.size());  // 3
        // 在指定下标添加元素，如果该下标有元素，那么会把这个元素往后挤
        list01.add(0,"html");
        list01.add(3,"python");
        System.out.println(list01);

        System.out.println("===========");
        // get(int index)-获取指定下标的元素
        System.out.println(list01.get(3));
        // set(int index,Object o)-修改指定下标的元素
        list01.set(3,"php");
        System.out.println(list01);

        // remove()-移除
        list01.remove("php");
        System.out.println(list01);

        System.out.println("===========");
        /*
        * - `indexOf(Object o)`：返回o第一次出现的索引位置
            - `lastIndexOf(Object o)`：返回o最后一次出现的索引
        * */
        list01.add("html");
        list01.add("html");
        list01.add("html");
        // [html, 123, java, mysql, html, html, html]
        System.out.println(list01.indexOf("html"));
        System.out.println(list01.lastIndexOf("html"));

        // subList(int start,int end)`：返回从start到end的所有元素
        // start包含，end不包含,左开右闭
        List<String> strings = list01.subList(1, 4);
        System.out.println(strings);

    }
}
