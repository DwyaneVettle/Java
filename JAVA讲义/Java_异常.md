# Java_异常

## 1.什么是异常

​	生活中的异常：感冒发烧、电脑蓝屏、手机死机等。

​	程序中的异常：磁盘空间不足、网络连接中断、被加载的资源不存在等。

​	程序异常解决办法：针对程序中非正常情况，Java语言引入了异常，以异常类的形式对这些非正常情况进行封装，并通过异常处理机制对程序运行时发生的各种问题进行处理。

```java
public class Test01 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        System.out.println(num1 / num2);
    }
    
}
```

![image-20230407115956680](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202304071200873.png)



​	在Java中，左右的异常类型都是`Throwable`的子列，因为`Throwable`在异常类的层次结构的顶层。它有两个分支：

- **Error**：表示不希望被程序捕获或是程序无法处理的错误；
- **Exception：**表示用户程序可能捕获到的异常情况或者是程序可以处理的异常。

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202304071206222.png" style="zoom:50%;" />

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202304071208254.png" style="zoom:50%;" />	

**Error和Exception的区别和联系：**

**1.Error**

- Error 类对象由 Java 虚拟机生成并抛出，大多数错误与代码编写者所执行的操作无关。
- 比如说： Java虚拟机运行错误（ Virtual MachineError ），当JVM不再有继续执行操作所需的内存资源时， 将出现 OutOfMemoryError 。这些异常发生时，Java虚拟机（JVM）一般会选择线程终止。
- 还有发生在虚拟机试图执行应用时，如类定义错误（ NoClassDefFoundError ）、链接错误 （ LinkageError ）。这些错误是不可查的，因为它们在应用程序的控制和处理能力之 外，而且绝大多数是程序运行时不允许出现的状况。
  **2.Exception**

- Exception 分支中有一个重要的子类 RuntimeException （运行时异常），该类型的异常自动为你所编写的程序定义 ArrayIndexOutOfBoundsException （数组下标越界）、 NullPointerException （空指针异常）、ArithmeticException （算术异常）、 MissingResourceException （丢失资源）、 ClassNotFoundException （找不到类）等异常，这些异常是不检查异常，程序中可以选择捕获处理，也可以不处理。 这些异常一般是由程序逻辑错误引起的，程序应该从逻辑角度尽可能避免这类异常的发生。
- 而 RuntimeException 之外的异常我们统称为非运行时异常，类型上属于 Exception 类及其子类， 从程序语法角度讲是必须进行处理的异常，如果不处理，程序就不能编译通过。如 IOException 、 SQLException 等以及用户自定义的 Exception 异常，一般情况下不自定义检查异常。
- 

​	异常分为编译时异常和运行时异常。**编译异常**是指程序在编译时期产生的异常，而这些异常必须要进行处理，也称为checked异常。而**运行时异常**是指即使不编写异常处理代码，依然可以通过编译，也成为unchecked异常。

![](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202304071631334.png)





## 2.try-catch语句和finally

​	当程序发生异常时会立即终止，无法继续向下执行，为了保证程序能继续有效执行，Java提供了一种异常处理方式---异常捕获。其基本格式为：

```java
try{
    // 可能发生异常的语句
} catch(Exception或其子类 e) {
    // 对捕获的异常进行响应的处理
} finally {
    // 一定执行的代码，一般用于释放资源
}
```

执行除法运算处理异常：

```java
try {
     int num1 = 10;
     int num2 = 0;
     System.out.println(num1 / num2);
} catch (ArithmeticException e) {
     e.printStackTrace();  // 打印异常消息
} finally {
     System.out.println("这里的代码都会执行。。。");
}
```



## 3.throws关键字

​	如果不确定或不急于处理的异常，怎么办？

​	一般在程序开发中，开发者通常会意识到程序可能出现问题，可以直接通过try-catch对异常进行捕获。但有些时候，方法中代码是否会出现异常，开发者并不明确或不急于处理，为此，Java允许将这种异常从当前方法中抛出，然后让后续的调用者在使用时再进行异常处理。这个时候我们就可以采用throws关键字用在方法上声明抛出的异常，多个异常之间使用逗号分隔即可。

​	其语法格式为：

```java
[修饰符] 返回值类型 方法名(参数) throws 异常1,异常2...{
    // 方法体
}
```

定义除法的方法，处理除数不能为0的异常：

```java
public static void main(String[] args) throws Exception {
    divide(10,0);
}
public static void divide(int num01,int num02) throws Exception{
    System.out.println(num01 / num02);
}
```

![image-20230407165028887](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202304071650955.png)





​	在程序中，除了可以通过throws抛出异常外，还可以使用`throw`关键字抛出异常。

- **throws:**用在方法声明中，用来指明方法中抛出的多个异常。
- **throw:**用在方法体中，并且抛出的是一个异常类对象。

```java
public static void main(String[] args) {
   getAge(-23);
}
public static void getAge(int age){
   System.out.println("年龄是:" + age);
}
```

​	我们发现在获取年龄的方法`getAge()`中传递了一个-23岁的年龄，这显示是不符合常理的，所以这个时候我们就可以在程序中对这个异常进行处理：

```java
public static void main(String[] args) throws Exception {
     getAge(-23);
}
public static void getAge(int age) throws Exception {
     if(age < 0 || age > 200) {
         throw new Exception("年龄不合法！");
	 } else {
         System.out.println("年龄是:" + age);
     }
}
```

![image-20230407170130583](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202304071701646.png)

​	如果想要正常打印错误，也可以进行如下处理：

```java
public static void main(String[] args) {
    try {
        getAge(-23);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
public static void getAge(int age) throws Exception {
    if(age < 0 || age > 200) {
        throw new Exception("年龄不合法！");
    } else {
        System.out.println("年龄是:" + age);
    }
}
```

![image-20230407170311952](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202304071703004.png)





## 4.自定义异常

​	Java中定义了大量的异常类，虽然这些异常类可以应付大多数场景的异常情况，但在程序中有时需要描述程序中特有的异常情况，例如在`divide()`方法中不允许除数为负数。

​	这个时候我们就需要使用**自定义异常**，使用自定义异常时必须继承自`Exception`或其子类。

```java
public class MyException extends Exception{

    public MyException() {} 
    public MyException(String msg) {
        super(msg);
    }
}
```

```java
public static void main(String[] args) {
    try{
        divide(10,0);
    } catch (MyException me) {
        me.printStackTrace();
    }
}

public static void divide(int num1,int num2) throws MyException {
    if(num2 < 0 || num2 == 0) {
        throw new MyException("除数不能为0或负数。。");
    } else {
        System.out.println(num1 / num2);
    }
}
```

![image-20230407171933139](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202304071719214.png)



## 5.垃圾回收

​	在Java中，当一个对象称为垃圾后仍占用内存空间，时间一长就会累积很多的垃圾，这样就会导致内存空间不足。针对这种情况，Java引入了垃圾回收机制（Java GC）。有了垃圾回收机制，Java虚拟机会自动回收垃圾所占用的内存空间。

​	除了虚拟机自动回收外，程序员也可以使用手动垃圾回收的方式，以通知系统回收垃圾，手动回收的两种方式为：

- `System.gc()`

- `Runtime.getRuntime.gc()`

  当一个对象在内存中被释放时，它的`finalize()`方法会被自动调用，如果程序终止之前仍没有进行垃圾回收，则不会调用失去引用对象的`finalize()`方法来清理资源。

```java
public static void main(String[] args) {
    method01();
    method02();
}

public static void method01() {
    Person p = new Person();
    p = null; // 置为null,让其变为垃圾
    for (int i=1;i<=10;i++) {
        System.out.println("aaa");
    }   
}
public static void method02() {
    Person p = new Person();
    p = null; // 置为null,让其变为垃圾
    // System.gc();
    Runtime.getRuntime().gc();
    for (int i=1;i<=10;i++) {
        System.out.println("bbb");
    }
} 
```

​	我们发现手动垃圾回收都不确定垃圾释放后还会不会执行其它程序，充满了不确定性。因此更多的是采用JVM的垃圾回收机制，不需要手动回收。