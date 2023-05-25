package week14;

import java.util.TreeMap;

/**
 * @Description TreeMap
 * @Author Michealzou@126.com
 * @Date 2023/5/25 11:30
 **/
public class Test03 {

    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        
        tm.put("002","张三");
        tm.put("005","王五");
        tm.put("001","老刘");
        tm.put("003","李四");
        System.out.println(tm);
    }
}
