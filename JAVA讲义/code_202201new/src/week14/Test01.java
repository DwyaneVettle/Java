package week14;

import java.util.ArrayList;
import java.util.HashMap;

/*
*  HashMap:双列集合   key-value
*       key与value之间是一对一的关系，key不可以重复，value可以重复
*       结构：哈希表=数组+链表，数组是基本结构，链表是哈希值冲突的时候的加载形式
* */
public class Test01 {

    public static void main(String[] args) {
        // 创建HashMap对象
        // <> 泛型-规定对象所使用的数据类型
        HashMap<String, String> map = new HashMap<>();
        // 1.添加元素put(K key, V value) 
        map.put("001","张三");
        map.put("002","李四");
        map.put("003","王五");
        // map.put("003","老刘"); key不能重复，如果在put时，key重复，那么新的value会替代旧的value
        System.out.println(map);

        System.out.println("==========");
        // key.hashCode()
        System.out.println("001".hashCode());
        System.out.println("002".hashCode());
        System.out.println("003".hashCode());
        // 哈希值相同，以链表形式挂载
        System.out.println("通话".hashCode());
        System.out.println("重地".hashCode());
        
        // 获取长度size()
        System.out.println(map.size());
        
        // 获取值-通过key获取value -get()
        System.out.println(map.get("001"));
        System.out.println(map.get("002"));
        System.out.println(map.get("003"));
        System.out.println("============");
        // 判断有没有包含Key-containsKey
        // 判断有没有包含value-containsValue
        System.out.println(map.containsKey("004")); // false
        System.out.println(map.containsValue("老刘")); // false
        
        // 根据key删除value-remove() 返回被删除的value
        System.out.println(map.remove("003"));
        
        // 替换-replace()
        map.replace("002","王锐");
        System.out.println(map);

        // 获取所有的value
        System.out.println(map.values());
        
        // 清空map
        map.clear();
        System.out.println(map);
        
        
    }
}
