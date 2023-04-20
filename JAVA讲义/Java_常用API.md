# Java_常用API

​	API即**A**pplication **P**rogramming **I**nterface，即应用程序接口。一般来说API就是软件组件之间信息交互的桥梁，通过它无需访问源码。API除了有`应用程序接口`的含义外，还特质API的说明文档，也称为帮助文档。

## 1.字符串的操作

​	Java中定义了String和StringBuffer/StringBuilder两个类来封装字符串，并提供了一些列操作字符串的方法，由于它们都位于`java.lang`包中，所以不需要导包就可以直接使用。

- 字符串的初始化：

```java
String 变量名 = "值";

String 变量名 = new String();
String 变量名 = new String(String value);
String 变量名 = new String(char[] value);
```

```java
String s1 = "hello";
System.out.println(s1);

String s2 = new String();
System.out.println(s2);

char[] arr = {'你','好'};
String s3 = new String(arr);
System.out.println(s3);

byte[] arr2 = {97,98,99};
String s4 = new String(arr2);
System.out.println(s4); // abc
```



### 1.1.String类的常用方法

- **判断功能：**
  - `boolean equals(String S)`：判断两个字符串是否相同，区分大小写
  - `boolean equalsIgnoreCase(String s)`：判断两个字符串是否相同，忽略大小写
  - `boolean startsWith(String s)`：判断当前字符串是否以s开头
  - `boolean endsWith(String s)`：判断当前字符串是否以s结尾
  - `boolean contains(String s)`：判断当前字符串是否包含s
  - `boolean isEmpty()`：判断字符串是否为空

```java
public static void method01() {
    String s1 = "HelloWorld";
    System.out.println(s1.equals("helloworld")); // false
    System.out.println(s1.equalsIgnoreCase("helloworld")); // true
    System.out.println(s1.startsWith("h")); // false
    System.out.println(s1.endsWith("ld")); // true
    System.out.println(s1.contains("llo")); // true
    System.out.println(s1.isEmpty()); // false
}
```



- **获取功能：**
  - `int length()`：返回字符串的长度
  - `char charAt(int index)`：返回对应索引的字符
  - `int indexOf(String s)`：返回s的第一次索引位置
  - `int lastIndexOf(String s)`：返回s最后一次索引位置 
  - `String concat(String s)`：拼接字符转
  - `String substring(int index)`：从指定位置到结尾截取字符串
  - `String substring(int start,int end)`：从start开始到end结束截取字符串，左开右闭

```java
public static void method02() {
    String s1 = "HelloWorld";
    System.out.println(s1.length()); // 10
    System.out.println(s1.charAt(0)); // H
    System.out.println(s1.indexOf("l")); // 2
    System.out.println(s1.lastIndexOf("l")); // 8
    System.out.println(s1.concat("Java"));
    System.out.println(s1.substring(2)); // lloWorld
    System.out.println(s1.substring(2,8)); // lloWor
}
```



- **转换功能：**
  - `char[] toCharArray()`：将字符串转为字符数组
  - `byte[] getBytes()`：将字符串转为字节数组
  - `String toUpperCase()`：将字符串转为小写
  - `String toLowerCase()`：将字符串转为小写
  - `String valueOf(int i)`：将数据转为字符串

```java
public static void method03() {
    String s1 = "HelloWorld";
    char[] arr =s1.toCharArray();
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    System.out.println("========");
    byte[] arr2 =s1.getBytes();
    for (int i = 0; i < arr2.length; i++) {
        System.out.println(arr2[i]); // 对应字符的码表值
    }
    System.out.println(s1.toUpperCase()); // HELLOWORLD
    System.out.println(s1.toLowerCase()); // helloworld

    System.out.println(String.valueOf(55));
}
```



- **其他功能：**
  - `String[] split(String regex)`：将字符串按指定规则切割，返回字符串数组
  - `String trim()`：去除字符串两端空格

```java
public static void method04() {
    String s1 = "Java-Python-Mysql-Html";
    String[] s2 = s.split("-");
    for (int i = 0; i < s2.length; i++) {
        System.out.println(s2[i]);
    }
    String s3 = "    Java  Python";
    System.out.println(s3.trim());
}
```



**练习：**

​	现有字符串如下：

```java
String s1=" SSSCCsdfgsdAX@$#67 ";
String s2=“sssdCCsdfGSDAX@$#67”;
```

完成以下操作（默认对s1操作）：

（1）：保存在字符数组中；
 （2）：取得第三个元素值；
 （3）：打印输出该字符串的每个字符；
 （4）：截取"sd"该子串；
 （5）：返回"67"的下标位置
 （6）：返回"gsd"的最后一个下标位置
 （7）：判断两个字符串是否相等【两种方法操作】
 （8）：将两个字符串进行连接为一个字符串，s2在前面，s1在后面
 （9）：去掉s1前后空格
（10）：将s1只要是大写字符全部转为小写
（11）:判断最后面的字串是不是“67”
（12）：判断s2最前面的字串是不是“sss”



### 1.2.StringBuffer类

​	在Java中，`String`类是被关键字`fianl`修饰的，所以一旦使用`String`类创建了字符串后就不能改变，其内容和长度是不可变的。

​	不过Java也提供了`StringBuffer/StringBuilder`（字符串缓冲区）来操作字符串。它与`String`类最大的区别就是其**长度和内容可变**。`StringBuffer`类就相当于一个容器，对其添加或删除时，相当于是对这个容器操作，因此并不会产生新的`StringBuffer`对象。	

​	其创建字符串缓冲区的方式为：

```java
StringBuffer sb = new StringBuffer();
StringBuffer sb2 = new StringBuffer(String s);
```

​	`StringBuffer`常用的方法为：

```java
StringBuffer append(char c);  // 添加字符到末尾
StringBuffer insert(int offset,String s);  // 在offset位置插入s
StringBuffer deleteCharAt(int index);  // 删除index位置的字符
StringBuffer delete(int start,int end); // 删除从start开始end（不包含）结束的的字符
StringBuffer replace(int start,int end,String s); // 将start-end的字符用s替换
void setCharAt(int index,char c); // 修改指定位置处的字符为c
String toString(); // 返回字符串对象
StringBuffer reverse();  // 反转
```

```java
public class StringBufferTest {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb02 = new StringBuffer("Hello");
        System.out.println(sb02.append("World")); // HelloWorld
        System.out.println(sb02.insert(5,"Java")); // HelloJavaWorld
        System.out.println(sb02.deleteCharAt(4)); // HellJavaWorld
        System.out.println(sb02.delete(0,3)); // lJavaWorld
        System.out.println(sb02.replace(0,4,"Python")); // PythonaWorld
        System.out.println(sb02.reverse()); // dlroWanohtyP

    }
}
```



## 2.System类

​	System类定义了一些与系统相关的属性和方法，它提供的方法都是静态的，因此，想要用这些方法，直接通过`System`调用即可。它的常用方法如下：

| 方法                                                         | 描述                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| static void exit(int status)                                 | 终止当前正在运行的Java虚拟机，其中status为状态码，若状态码为非0，则为异常终止 |
| static void gc()                                             | 进行手动垃圾回收                                             |
| static native long currentTimeMillis()                       | 返回以毫秒为单位的当前时间                                   |
| static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length) | 从src引用的指定源数组复制到dest引用的数组，复制从指定位置开始，到目标数组的指定位置结束 |
| static Properties getProperties()                            | 获取当前系统的属性                                           |
| static String getProperty(String key)                        | 获取指定Key描述符的属性                                      |

```java
public class SystemTest {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.exit(0);
            }
            System.out.println(i); // 0,1,2,3,4
        }*/

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.arraycopy(src,1,dest,3,2);
        for (int i = 0; i < dest.length; i++) {
            System.out.print(dest[i] + " "); // 6,7,8,2,3
        }

        System.out.println(System.getProperties());
        System.out.println(System.getProperty("os.name"));
    }
}
```



## 3.Runtime类

​	`Runtime`类用于表示Java虚拟机运行时的状态，它用于封装Java虚拟机的进程。每次使用“'java'命令启动Java虚拟机都会创建一个对应Runtime实例，并且只有一个实例，应用程序会通过该实例与其运行时的环境相连。

​	获取`Runtime`实例的方法：

```java
Runtime run = Runtime.getRuntime();
// Runtime提供了一个exec()方法，该方法用于执行一个DOS命令，功能和窗口输入DOS命令相同
```

​	常用方法有：

| 方法                      | 描述           |
| ------------------------- | -------------- |
| int availableProcessors() | 获取处理器个数 |
| long freeMemory()         | 获取空闲内存   |
| long maxMemory()          | 获取最大内容   |
| Process exec()            | 执行DOS命令    |

```java
public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt);
        System.out.println(rt.availableProcessors()); // 4
        System.out.println((rt.freeMemory()) / 1024 /1024 + "MB");
        System.out.println((rt.maxMemory()) / 1024 /1024 + "MB");

        Process ip = rt.exec("notepad.exe"); // 打开记事本
    }
}
```



## 4.Math类

​	`Math`类是一个专门用于做数学运算的工具类，入求绝对值等。由于这个类被`private`修饰，并且方法都为静态，因此无法创建对象，只能通过类名直接调用方法。除静态方法外，Math类还有两个常量，`PI`和`E`，分别代表数学中的`Π`和`e`。

​	常用方法如下：

- `Math.obs(int num)`：计算绝对值
- `Math.sin(double num)`：计算余弦
- `Math.cos(double num)`：计算正弦
- `Math.tan(double num)`：计算正切
- `Math.sqrt(int num)`：计算平方根
- `Math.cbrt(int num)`：计算立方根
- `Math.pow(int num1,int num2)`：乘方，num1的num2次方
- `Math.ceil(double  num)`：向上取整
- `Math.floor(double num)`：向下取整
- `Math.round(double num)`：四舍五入
- `Math.max(double num1, double num2)`：求两个数的最大值
- `Math.min(double num1,double num2)`：求两个数的最小值
- `Math.random()`：生成一个0(包含)-1(不包含)的随机数

```java
public class MathTest {

    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.sin(2.2));
        System.out.println(Math.cos(2.2));
        System.out.println(Math.tan(2.2));
        System.out.println(Math.sqrt(5));
        System.out.println(Math.cbrt(5));
        System.out.println(Math.pow(5,2));
        System.out.println(Math.ceil(5.4));
        System.out.println(Math.floor(5.4));
        System.out.println(Math.round(5.4));
        System.out.println(Math.max(5.4,6.5));
        System.out.println(Math.min(5.4,6.5));
        System.out.println(Math.random());

    }
}
```



## 5.Random类

​	`Random`类用于指定范围内的随机数。常用方法有：

- `boolean nextBoolean()`：随机生成boolean类型的随机数
- `boolean nextDouble()`：随机生成double类型的随机数
- `float nextFloat()`：随机生成float类型的随机数
- `int nextInt()`：随机生成int类型的随机数
- `int nextInt(int n)`：随机生成[0,n)之间int类型的随机数
- `long nextLong()`：随机生成long类型的随机数

```java
public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.println(r.nextBoolean());
        System.out.println(r.nextDouble());
        System.out.println(r.nextFloat());
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(100));
        System.out.println(r.nextLong());
    }
}
```

