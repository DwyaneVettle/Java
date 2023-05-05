package colloctions;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // 往map中放元素
        map.put("001","张三");
        map.put("002","李四");
        map.put("003","王五");
        map.put("003","老六"); // 键不重复，如果重复会替换旧的元素

        System.out.println(map); // {001=张三, 002=李四, 003=老六}

        System.out.println("001".hashCode()); // 和下面不通
        System.out.println("002".hashCode());
        System.out.println("通话".hashCode()); // 和下面相同
        System.out.println("重地".hashCode());

        // 获取集合长度
        System.out.println(map.size()); // 3

        // 通过键获取值
        System.out.println(map.get("001"));

        // 判断集合中有没有指定的键
        System.out.println(map.containsKey("001"));

        // 判断集合中有没有指定值
        System.out.println(map.containsValue("张三"));

        // 根据Key删除value
        System.out.println(map.remove("001"));

        // 替换
        map.replace("002","胡八一");
        System.out.println(map);

        // 将集合清空
        map.clear();
        System.out.println(map);


    }
}
