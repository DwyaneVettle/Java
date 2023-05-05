package colloctions;

import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("001","张三");
        tm.put("002","李四");
        tm.put("003","王五");

        System.out.println(tm);

    }
}
