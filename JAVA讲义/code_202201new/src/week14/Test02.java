package week14;

import java.util.*;

/*
*   HashMap遍历
*   
* */
public class Test02 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        
        map.put("name","张三");
        map.put("sex","男");
        map.put("age","20");
        
        // 1.keySet()返回此地图中包含的键的Set视图
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String key:keys) {
            System.out.println(key);
        }

        System.out.println("============");
        // 2.entrySet()-将集合包装成entry，再遍历entry
        // 返回此地图中包含的键的Set视图
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-" + value);
        }
        
        // 3.forEach()
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
