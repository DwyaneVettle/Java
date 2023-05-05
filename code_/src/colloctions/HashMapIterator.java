package colloctions;

import java.util.*;

public class HashMapIterator {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("张三","男");
        map.put("李四","女");
        map.put("王五","男");

        // 1.keySet()遍历
        Set<String> set = map.keySet();
        for (String key:set) {
            System.out.println(key + "-" + map.get(key));
        }

        System.out.println("=========");

        // 2.entrySet()
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while(it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-" + value);
        }

        // 3.forEach(BiConsumer)
        map.forEach((String key,String value) -> {
            System.out.println(key + "-" + value);
        });

        // 4.values()
        Collection<String> values = map.values();
        values.forEach((String value) -> {
            System.out.println(value);
        });

    }
}
