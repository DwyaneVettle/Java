#   Java_集合

​	数组可以保存多个对象，但在无法确定要保存多少个对象时，数组便不宜使用，因为数组长度不可变。

​	例如，要保存一个学校的学生信息，由于不停有新生报到，也有毕业生离校，这时学生的数码将无法规定，并且随时可能变动。

​	为了保存这些数目不确定的对象，Java中提供了集合，**集合可以存储任意类型的对象，并且长度可变**。

![image-20230426162417821](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305102155620.png)

## 1.Collection接口

- 主要方法

| 方法                                      | 描述                                              |
| ----------------------------------------- | ------------------------------------------------- |
| boolean add(Object o )                    | 向集合中添加一个元素                              |
| boolean addAll(Collection<? extends E> c) | 将指定集合中的所有元素添加到此集合（可选操作）    |
| void clear()                              | 从此集合中删除所有元素                            |
| boolean remove(Object o)                  | 从该集合中删除指定元素的单个实例（如果存在）      |
| boolean removeAll(Collection<?> c)        | 删除指定集合中包含的所有此集合的元素              |
| boolean isEmpty()                         | 如果此集合不包含元素，则返回 `true`               |
| boolean contains(Object o)                | 如果此集合包含指定的元素，则返回 `true`           |
| boolean containsAll(Collection<?> c)      | 如果此集合包含指定 `集合`中的所有元素，则返回true |
| Iterator<E> iterator()                    | 返回此集合中的元素的迭代器                        |
| int size()                                | 返回此集合中的元素数                              |
| default Stream<E> stream()                | 返回以此集合作为源的顺序 `Stream`                 |

```java
public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("mysql");
        System.out.println(list);

        Collection<String> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);

        list2.clear();
        System.out.println(list2);

        boolean b = list.remove("mysql");
        System.out.println(b);
        System.out.println(list);

        Collection<String> list3 = new ArrayList<>();
        list3.add("hello");
        list3.add("world");
        list.removeAll(list3); // 将list中包含list3的所有元素删除
        System.out.println(list);

        System.out.println(list.isEmpty());

        System.out.println(list.contains("java"));

        System.out.println(list.containsAll(list3));

        System.out.println(list.size());
    }
}
```



## 2.List接口

​	List组件向用户显示文本项的滚动列表，可以设置列表 ，以便用户可以选择一个项目或多个项目。List接口的实现类有ArrayList和LinkedList。List接口有以下特点：

- 存取有序
- 有索引
- 可以存储重复元素

常用方法参考：

- `add(String item,  int index)` ：在对应下标添加元素
- `remove(int position)`：移除指定位置元素
- `get(int index)` ：获取列表中指定索引的元素
- `set(int index,Object o)`：将指定索引位进行修改
- `indexOf(Object o)`：返回o第一次出现的索引位置
- `lastIndexOf(Object o)`：返回o最后一次出现的索引
- `subList(int start,int end)`：返回从start到end的所有元素
- `toArray()`：将集合转为数组

```java
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("java");
        list.add(0,"abc"); // 在0索引添加abc,原有元素后移
        list.add(1,"nba"); // 在1索引添加abc,原有元素后移
        System.out.println(list);

        String s = list.get(0);
        System.out.println(s);

        String s1 = list.remove(1);
        System.out.println(list.remove("java"));

        list.set(0,"Python");
        System.out.println(list);

        System.out.println(list.indexOf("Python"));
        list.add("Python");
        System.out.println(list.lastIndexOf("Python"));

        System.out.println(list.subList(0,1));

        Object[] arr = list.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        


    }
}
```



### 2.1.ArrayList

​	`ArrayList`是程序中最常见的一种集合，它的内部存储结构是数组形式，有如下几个特点：

- ArrayList在增删指定位置元素时，会**创建新的数组**，效率比较低，因此**不适合做大量增删操作**；
- ArrayList允许通过索引访问元素，使用它在**遍历或查找元素时非常高效**。

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305050958863.png" alt="image-20230505095809685" style="zoom:33%;" />

​	ArrayList所有的方法都参考Collection和List。

```java
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("php");
        System.out.println(list.size());
        System.out.println(list.get(0));

    }
}
```



### 2.2.LinkedList

​	`LinkedList`内部包含两个`Node`类型的first和last属性的**双向循环列表**结构。它具有以下特点：

- LinkedList遍历和查找的效率较低；
- 对增删操作表现很高的效率。

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305051005928.png" alt="image-20230505100521856" style="zoom: 50%;" />

除Collection和List的方法外，其他常用方法如下：

- `getFirst()` ：返回此列表的第一个元素
- `getLast()` ：返回此列表的最后一个元素
- `addFirst(E e)` ：在列表开头插入指定元素
- `addLast(E e)` ：追加元素到列表末尾
- `removeFirst()` ：移除列表第一个元素
- `removeLast()` ：移除列表最后一个元素
- `offer(E e)`：将指定元素添加到列表尾部
- `offerFirst(E e)` ：在列表前面插入元素
- `offerLast(E e)` ：在列表末尾插入指定元素

```java
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add("java");
        list.add("python");
        System.out.println(list);

        list.addFirst("HTML");
        list.addLast("Mysql");
        System.out.println(list);

    }
}
```



### 2.3.Iterator

​	Iterator接口是Java集合中的一员，主要用于**迭代访问（遍历）**Collection中的元素，因此Iterator对象也被称为迭代器。

![](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305051034417.png)

示例：

```java
Iterator<Object> it = list.iterator();
while (it.hasNext()) {
    Object obj = it.next();
    System.out.println(obj);
}
```

Iterator的成员方法有：

- `hasNext()`：如果仍有元素可迭代，返回true
- `next()`：返回迭代的下一个元素
- `remove()`：移除迭代器最后一个元素

```java
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
```

### 2.4.forEach遍历

​	forEach是一种更加简洁的for循环，也称为增强for循环，用于遍历数组或集合中的元素，它的底层也是依赖迭代器。其语法结构如下：

```java
for(容器中元素类型 临时变量:容器变量) {
    // 执行语句
}
示例
for(Object o : list) {
    System.out.println(o);
}
```

```java
public class ForEach {

    public static void main(String[] args) {
        // 遍历集合
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("Python");
        list.add("PHP");
        list.add("HTML");
        for (String l :list) {
            System.out.println(l);
        }
        System.out.println("=====");
        // 遍历数组
        String[] arr = {"刘德华","张学友","黎明","郭富城"};
        for (String a :arr) {
            System.out.println(a);
        }

    }
}
```

​	在JDK8后增加了对forEach的Lambda表达式写法：

```java
list.forEach(obj -> System.out.println("迭代元素" + obj));
```

```java
ArrayList<String> list = new ArrayList<>();
list.add("java");
list.add("Python");
list.add("PHP");
list.add("HTML");
list.forEach(obj -> System.out.println(obj));
```



## 3.Set接口

​	Set接口和List接口一样，都继承自Collection接口。Set接口中的元素无序，并且都会以某种规则保证存入的**元素不出现重复**。

​	Set接口的主要实现类有两个：HashSet和TreeSet。

- HashSet：根据对象的哈希值来确定元素在集合中存储的位置，因此具有良好的存取和查找性能；
- TreeSet：以二叉树的形式存储元素，它可以实现对集合中的元素进行排序。

数据类型演示参考：https://www.cs.usfca.edu/~galles/visualization/Algorithms.html



### 3.1.HashSet

​	HashSet存储的元素**不重复**，并且**无序**。特点是：当向HashSet集合中添加一个元素时，**首先会调用该元素的`hashCode()`方法来确定该元素的存储位置，然后再调用元素对象的`equals()`方法来保证该位置没有重复元素**。

```java
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("java"); // 不存储重复元素
        System.out.println(set); // [world, java, hello]
        // System.out.println(set.hashCode());
        set.forEach(str -> System.out.println(str));
    }
}
```



### 3.2.TreeSet

​	TreeSet内部使用平衡二叉树来存储元素，用来保证它没有重复的元素，并且可以对元素进行排序。

​	**二叉树就是每个节点最多有两个子节点的有序树**。每个节点及其子节点组成子树，左侧节点称为“左子树”，右侧节点称为“右子树”，其中**左子树上的元素小于它的根节点**，而**右子树上的元素大于根节点**。

![image-20230505113550589](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305051135657.png)

TreeSet的存储原理：

1. TreeSet集合没有元素时，新增的第一个元素会在二叉树最顶层；
2. 接着新增元素时会和根节点进行比较；
3. 如果小于根节点元素就与左边分支比较；
4. 如果大于根节点元素就与右边分支比较；
5. 以此类推。

TreeSet特有的方法：

- `first()`：返回此集合中第一个（最低）元素
- `last()`：返回此集合中最后一个（最高）元素
- `lower(Object o)`：返回集合中小于给定元素o的最大元素，没有则返回null
- `floor(Object o)`：返回集合中小于或等于给定元素o的最大元素，没有则返回null
- `higher(Object o)`：返回集合中大于给定元素o的最大元素，没有则返回null
- `ceiling(Object o)`：返回集合中小于或等于给定元素o的最大元素，没有则返回null
- `pollFirst()`：移除并返回集合中第一个元素
- `pollLast()`：移除并返回集合中最后一个元素



​	此外，向TreeSet集合中添加元素时，都会调用`compareTo()`方法进行比较排序，该方法是`Comparable`接口中定义的，因此想要给集合排序就必须实现`Comparable`接口。

​	Java中大部分类都实现了`Comparable`接口，并默认实现了`compareTo()`方法。

​	TreeSet的排序有两种方式：

- 自然排序：实现Comparable接口，并重写compareTo()方法
- 定制排序：自定义一个比较器，该比较器必须实现Comparable接口，并重写compare()方法，然后将该比较器作为参数传入集合的有参构造。

**自然排序：**

创建Person类：

```java
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

创建测试类：

```java
public class Test01 {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>();

        Person p1 = new Person("张三", 20);
        Person p2 = new Person("李四", 22);
        Person p3 = new Person("王五", 24);

        ts.add(p1);
        ts.add(p2);
        ts.add(p3);

        System.out.println(ts);
    }
}
```

运行时报错，原因时Person类没有实现Comparable接口：

![image-20230505142355484](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305051423574.png)

在Person类中实现接口Comparable，并重写compareTo()方法，按年龄降序排序：

![image-20230505142742241](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305051427305.png)

```java
@Override
public int compareTo(Person p) {
    int result = p.age - this.age;
    return result;
}
```

再次运行：

![image-20230505143134357](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305051431422.png)



**定制排序：**

创建Teacher类：

```java
public class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

创建测试类，并在TreeSet中创建Comparator的匿名内部类：

```java
public class Test02 {

    public static void main(String[] args) {
        TreeSet<Teacher> ts = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher t1, Teacher t2) {
                int result = t1.getAge() - t2.getAge();
                return result;
            }
        });

        Teacher t1 = new Teacher("张三", 20);
        Teacher t2 = new Teacher("李四", 18);
        Teacher t3 = new Teacher("王五", 28);
        
        ts.add(t1);
        ts.add(t2);
        ts.add(t3);

        System.out.println(ts);

    }
}
```

运行结果：

![image-20230505143912474](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305051439543.png)



## 4.Map接口

​	Map是一种双列集合，它的每一个元素都包含一个**键对象key**和一个**值对象value**，键值对之间存在一种对应关系，称为**映射**。

​	Map中的映射关系是一对一的，一个键对象对应一个值对象，它们可以是任意数据类型，其中**键对象Key不允许重复**，这样通过key就能访问集合中对应的value了。

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305051445247.png" alt="image-20230505144508140" style="zoom:33%;" />



<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305051451729.png" alt="image-20230505145101657" style="zoom:50%;" />

### 4.1.HashMap

​	HashMap是Map接口的一个实现类，它用于存储键值映射关系，该集合中的键不允许重复，但值可以重复，且集合中的元素是无序的。

​	HashMap的底层是由**哈希表**结构组成（**数组+链表的组合**），数组是HashMap的主体结构，链表则主要是解决哈希值冲突而存在的分支结构。因此，HashMap对元素的增删改查都表现出较高的效率。

![image-20230505145757423](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305051457563.png)

```java
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // 往map中放元素
        map.put("001","张三");
        map.put("002","李四");
        map.put("003","王五");
        map.put("003","老六"); // 键不重复，如果重复会替换旧的元素

        System.out.println(map); // {001=张三, 002=李四, 003=老六}

        System.out.println("001".hashCode()); // 和下面不同
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
```



### 4.2.Map的遍历

Map遍历以下几种方式：

- **keySet()：将遍历的Key保存在Set中，再遍历Set**

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305051507302.png" alt="image-20230505150730180" style="zoom: 50%;" />

- **entrySet()：将每一对数据封装成entry对象，再遍历entry对象**
- **forEach(BiConsumer)：JDK8新增方法**
- **values()：获取map中所有的值，再将值放入Collection中，再遍历Collection（只能获取value）**

```java
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
```



### 4.3.TreeMap

​	TreeMap的内部是通过二叉树来保证键的唯一性的，与TreeSet的原理一样，因此TreeMap中的所有键是按照某种顺序排列的。

​	TreeMap的排序方式可以参照TreeSet的**自然排序**和**自定义排序**。

```java
public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("001","张三");
        tm.put("002","李四");
        tm.put("003","王五");

        System.out.println(tm);
        
    }
}
```



### 4.4.Properties

​	Map中还有一个实现类HashTable，它和HashMap十分类似，主要区别就是**Hashtable线程是安全的**。

​	Hashtable还有一个子类为Properties，它主要用于存储字符串类型的键值。在实际的开发中，常使用Properties集合来存取**配置项**。

```java
public class PropertiesTest {
    public static void main(String[] args) {
        // 创建对象
        Properties p = new Properties();
        p.setProperty("username","admin");
        p.setProperty("password","123456");

        // 获取集合中的数据getProperty()
        String userName = p.getProperty("userName");
        String password = p.getProperty("password");

        System.out.println("用户为："+ userName + ",密码为：" + password);
    }
}
```

​	

​	`Properties`集合来存取配置项是创建一个后缀名为`properties`的文件，文件中用`k-v`形式存储配置，要读取这个配置项，使用`Properties`提供的`load()`读取方法即可，不仅如此，还可以使用`store()`方法将配置项写入到文件中。如下创建一个`config.properties`：

```properties
password=123456
userName=admin
```

测试：

```java
public class Test03 {

    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        // 通过load方法加载void load(InputStream in)
        prop.load(new FileInputStream("src/colloctions/config.properties"));

        String userName = prop.getProperty("userName");
        String password = prop.getProperty("password");
        System.out.println("用户为："+ userName + ",密码为：" + password);

        // 用store(OutputStream out,String comments) 将集合数据通过输出流写入文件
        prop.setProperty("tel","13800138000");
        prop.store(new FileOutputStream("src/colloctions/config.properties"),"更新手机号");
    }
}
```

输出信息：

![image-20230505161436006](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305051614086.png)



文件新增：

![image-20230505161448728](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305051614803.png)



## 5.Stream流

​	JDK8新增了一个`Stream`流接口，该接口可以将集合、数组中的元素转换为`Stream`流的形式，并结合`Lambda`表达式的优势来进一步简化集合、数组中查找、过滤、转换等操作，这一功能称为聚合操作。



### 5.1.创建Stream流对象

​	获取`Stream`流对象的方式有三种。

```java
public class InitStream {

    public static void main(String[] args) {
        Integer[] arr = {20,45,67,122};
        // 第一种：通过Arrays.stream()
        Stream<Integer> s1 = Arrays.stream(arr);
        s1.forEach((Integer i) -> {
            System.out.println(i);
        });

        // 第二种：通过Stream接口的of()方法
        Stream<String> s2 = Stream.of("aa", "bb", "cc");
        s2.forEach((String s ) -> System.out.println(s));

        // 第三种：通过单列集合
        ArrayList<String> list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        Stream<String> s3 = list.stream();
        s3.forEach((String s) -> System.out.println(s));
    }
}
```



​	关于`Stream`流的方法有很多，大家可以参考API文档。