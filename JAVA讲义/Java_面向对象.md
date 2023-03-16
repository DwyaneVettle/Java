# Java_面向对象

## 1.面向对象概述

​	**面向对象**是一种符合人类思想习惯的编程思想。显示生活中存在各种形态的不同事物，这些事物存在着各种各样的联系。在程序中使用对象来映射现实中的事物，使用对象的关系来描述事物之间的关系，这种思想就是面向对象的编程思想。使用面向对象思想的编程语言有：Java、Python、PHP。。。

​	与之相对的是**面向过程**的编程思想，面向过程就是分析出解决问题的所需步骤，然后用函数把这些步骤一一实现，使用的时候依次调用就行了。典型的代表是C语言。

​	面向对象的三大特征：

- **封装：**将面向对象的核心思想（对象的属性和行为）封装起来，不让外界知道其具体细节；
- **继承：**类与类之间的关系，通过继承，可以通过无需再编写新的类的情况下，对原有的类的功能进行扩展；
- **多态：**在一个类中定义的属性和行为被其他类继承后，当**把子类对象直接赋值给父类引用变量**时，相同引用类型的**变量调用同一个方法所呈现出的多种不同行为特征**。

​	<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171409474.png" alt="image-20230213152446030" style="zoom: 50%;" />

## 2.Java中的类与对象

​	**说明：**面向对象的编程思想，力图让程序中对事物的描述与该事物在现实中的形态保持一致。为了实现这一点，面向对象思想中提出了两个概念----类与对象。

- **类：**是一类事物的描述，包含属性和行为。如动物类、汽车类....
- **对象：**某一类事物的具体体现。如动物类的🐱、🐕、🐖、🐏等，汽车类的🚚、🚆、🚕、🚝等。

### 2.1.类

​	面向对象的核心思想是对象，但要创建对象，首先需要定义一个类。**类是对象的抽象**，用于描述一组对象的共同行为特征。以面向对象的思想，就可以将某一类中共同的特征和行为封装起来，把**共同的特征作为类的属性**（也叫成员变量），把**共同行为作为类的方法**（也叫成员方法）。

- **定义类：**

![image-20230213153631448](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171409475.png)

```java
public class 类名 {
    // 成员变量
    // 成员方法
}
```

```java
public class Person {
    
    // 成员变量:描述类的属性
    String name; // 人的姓名
    int age; // 人的年龄
    
    /*
    * 成员方法：
    *   格式：权限修饰符 返回值类型  方法名(args...) {方法体 return 返回值}
    * */
    // 吃饭的方法
    public void eat(String food) {
        System.out.println(name+ "正在吃" + food);
    }
    // 睡觉的方法
    public void sleep() {
        System.out.println(name + "正在睡觉");
    }
}
```



### 2.2.对象

​	对象是类的具体体现。要使用一个类，必须通过对象来实现，创建对象的语法格式为：

```java
类名 对象名 = new  类名();

Person p = new Person();
```

```java
/*
* 通过Person类创建对象
* */
public class Object {

    public static void main(String[] args) {
        // 1.创建对象
        Person p = new Person();
        
        // 2.使用成员变量--对象名.变量名
        System.out.println(p.name); // null
        System.out.println(p.age); // 0
        // 赋值
        p.name = "张三";
        p.age = 20;
        System.out.println("========");
        
        // 3.使用成员方法--对象名.方法名()
        p.eat("西瓜");
        p.sleep();
    }
}
```

其对象的**内存示意图**为：

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171409476.png" alt="image-20230213204006284" style="zoom:50%;" />

**代码执行流程为：**

1. Person类和Object类的字节码文件加载到方法区；
2. 找到主方法`main()`进入到栈空间，并创建对象`p`；
3. 一切`new`关键字的对象进入堆内存，并引入属性和方法；
4. 先执行`eat()`方法，执行完毕被销毁，再执行`sleep()`方法，执行完毕也随之销毁；
5. `main()`方法随着程序执行完成，也随之销毁。

**注意：**

- 程序执行完毕，垃圾将会被回收。回收的条件是引用计数器是否为0。
- 方法进入栈中采用“先来后出”的方式，这一过程被称为《压栈》。

### 2.3.对象的比较

​	在Java中有两种对象的比较方式，分为为“==”运算符和`equals()`方法，这两种方式有着本质的区别，以下面例子说明：

​	我们创建`Compare`类：

```java
public class ObjCompare {
    public static void main(String[] args) {
        // 创建两个String对象引用
        String c1 = new String("abc");
        String c2 = new String("abc");
        String c3 = c1;
        // 使用==运算符比较
        System.out.println("c2==c3的结果为：" + (c2==c3));
        // 使用equals()方法比较
        System.out.println("c2.equals(c3)的结果为：" + (c2.equals(c3)));
    }
}
```

​	运行结果为：

![image-20230215211711191](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171409477.png)

​	从上述运行结果中可以看出，“==”运算符和`equals()`方法比较的结果是不同的。**`equals()`方法是`String`类中的方法，它用于比较两个对象引用所指的内容是否相等；而“==”运算符比较的是两个对象引用的地址是否相等。**由于c1和c2是两个不同对象引用，两者在内存中的位置不同，而`String c3 = c1;`语句将c1的引用赋给c3，所以c1和c3这两个对象的引用是相等的，也就是打印`c1==c3`将返回`true`。它们的内存引用如下图：

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171409479.png" alt="image-20230215212805012" style="zoom:50%;" />



### 2.4.局部变量和成员变量

​	在类中定义的变量为**成员变量（全局变量）**，在方法中定义的变量为**局部变量**。Java遵守就近原则，谁离得近就优先使用谁。

我们在`eat()`方法中新增属性`String name = "李四";`，这时执行的是“李四正在吃xx”：

```java
// 吃饭的方法
public void eat(String food) {
    String name = "李四";
    System.out.println(name+ "正在吃" + food);
  }
```

![image-20230213205402508](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171409480.png)

**成员变量和局部变量的区别：**

1. 定义位置：
   - 成员变量：定义在类中，方法外
   - 局部变量：定义在方法内部
2. 内存中的位置：
   - 成员变量：在堆内存中
   - 局部变量：在栈内存中
3. 声明周期的区别：
   - 成员变量：随着对象的创建而创建，随着对象的消失而消失
   - 局部变量：随着方法的调用而创建，随着方法的消失而消失
4. 默认初始化值的区别：
   - 成员变量：有默认初始化值
   - 局部变量：没有默认初始化值，使用之前必须赋值



### 2.5.访问修饰符

​	在Java中，针对类和对象提供了四种访问级别，分别是`private`，`default`，`protected`和`public`。它们的访问控制级别由小到大为：

![image-20230215204422104](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171409481.png)

**四种访问级别说明：**

- **private(当前类访问级别)：**如果类的成员被`private`访问控制符来修饰，则这个成员只能被该类的其他成员访问，其他类无法直接访问。类的良好封装就是通过`private`来实现的。
- **default(包访问级别)：**如果一个类或者类的成员不适用任何访问控制符修饰，则称它为默认访问控制级别，这个类或者类的成员只能被本包中的其他类访问。
- **protected(子类访问级别)：**如果一个类成员被`protected`访问控制符修饰，那么这个成员就能被同一包下的其他类访问，也能被不同包下的该类的子类访问。
- **public(公共访问级别)：**这是一个最宽松的访问控制级别，如果一个类或者类的成员被`public`访问控制符修饰，那么这个类或者类的成员能被所有的类访问，不过访问类和被访问类是否在同一个包中。

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171409482.png" style="zoom:50%;" />



## 3.类的封装

​	封装是面向对象的核心思想。将对象的属性和行为封装起来，其载体就是类，类通常对客户隐藏其实现细节，这就是封装思想。例如，用户使用计算机，只需要使用手指敲击键盘就可以实现一些功能，无需知道计算机内部是如何工作的。即使知道计算机工作的原理，但在使用计算机时也并不依赖计算机工作原理这些细节。

​	采用封装思想保证了类内部数据结构的完整性，应用该类的用户不能轻易地直接操作此数据结构，只能执行类允许公开的数据。这样避免了外部操作对内部数据的影响，提高了程序的可维护性。

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171409483.png" alt="image-20230215214323016" style="zoom:50%;" />

​	假如我们利用上面创建的`Person`类，再创建一个`Demo`类来测试：

```java
public class Demo {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "张三";
        p.age = -123;
        System.out.println("姓名是：" + p.name + "，年龄是：" + p.age );
    }
}
```

​	我们可以发现我们创建的这个`Demo`类随意设置了数据，且有些数据是不合理的。那么我们就应该封装`Person`类，提高代码的可维护性。使用修饰符`private`就可以实现对类成员的封装：

```java
private String name; // 人的姓名
private int age; // 人的年龄
```

​	经过`private`封装后的属性，我们看到在本类中使用是没有问题的，但在`Demo`类中就报错了：

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171409484.png" alt="image-20230215215209579" style="zoom:50%;" />![image-20230215215223819](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171409485.png)

![image-20230215215223819](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171409485.png)

​	想要实现访问这两个属性，我们需要增加一个访问这两个属性的公共方法，这样`Demo`类就可以通过这个公共方法实现属性的访问。

```java
// 设置值
public void setName(String n) {
    name = n;
}
// 获取值
public String getName() {
    return name;
}
// 设置值
 public void setAge(String a) {
     if (a < 0 || a > 200) {
            System.out.println("你设置的年龄不合法");
        }else {
            age = a;
        }
}
// 获取值
public String getAge() {
    return age;
}
```

​	这是我们就可以在`Demo`类中通过`get`和`set`方法就可以设置值和访问值了：

```java
public class Demo {

    public static void main(String[] args) {
        Person p = new Person();
        // 设置值
        p.setName("张三");
        p.setAge(123);
        // 获取值
        String name = p.getName();
        int age = p.getAge();
        System.out.println("姓名是：" + name + "，年龄是：" + age );
    }
}
```

![image-20230215220448893](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171409486.png)



## 4.方法的重载和递归

​	重载就是函数或方法有相同的名称，但是参数列表不相同的情形。这样同名不同参数的函数或者参数之间，互相称之为重载。通俗理解就是**省了给method重新命名了，差不多都用同一个。**

​	而递归则是因特殊业务需求，需要在函数内部调用自己的过程，这样能做到“大事化小，小事化了”。  需要注意的是，**递归必须要有结束的条件**，不然就会陷入无限的递归状态，永远无法结束调用。

- 重载实例：

```java
public class Overload {

    public static void main(String[] args) {
        int sum = getSum(20,30);
        int sum01 = getSum(20,30,40);
        System.out.println(sum);
        System.out.println(sum01);
        
    }
    /**
     * 定义求两个整数和的方法
     * 明确参数：int num01, int num02
     * 返回值：int
     * */
    public static int getSum(int num01,int num02) {
        int sum = num01 + num02;
        return sum;
    }
    /**
     * 求三个数和的方法
     * 参数:int num01,int num02,int num03
     * 返回值：int
     */
    public static int getSum(int num01,int num02,int num03) {
        int sum = num01 + num02 + num03;
        return sum;
    }
}
```

- 递归实例：

```java
public class Recursion {
    public static void main(String[] args) {
        int sum = getSum(5);
        System.out.println(sum);
    }
    /**
     * 需求：求5-1之间的数字之和
     *  5+4+3+2+1
     *  5+(4-1之间的和) + 4+(3-1之间的和)...
     */
    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + getSum(num-1);
    }
}
```

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171409487.png" alt="image-20230216211258321" style="zoom:50%;" />

**练习：递归读取指定文件夹下的文件和目录：**

```java
public class Test1 {

    public static void showDirectory(File file) {
        File[] files=file.listFiles();
        for(File a:files) {
            System.out.println(a.getAbsolutePath());
            if(a.isDirectory()) {
                try{
                    showDirectory(a);
                }catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        File file=new File("D:\\");
        showDirectory(file);
    }
}
```



## 5.构造方法

​	实例化一个对象后，如果要为这个对象中的属性赋值，则必须通过直接访问对象的属性或调用setXXX()方法的方式才可以。如果需要在实例化对象的同时就为这个对象的属性进行赋值，则可以通过构造方法来实现。

​	**构造方法：**是类的一个特殊成员，它会在类实例化对象时被自动调用。以之前的`Person`类为例，我们只需要在你们去添加无参构造和有参构造，就可以在实例化对象时初始化一些值。

```java
// 无参构造
public Person() {
 }
// 有参构造
public Person(String name, int age) {
    this.name = name;
    this.age = age;
}
```

​	我们可以看到构造方法就是直接**以类名作为方法名**，根据参数的不同分为无参构造和有参构造。通过这两个不同的构造方法，创建出来的对象也是不同的：

```java
Person p1 = new Person();  // 无参构造创建对象
Person p2 = new Person("张三",20); // 有参构造创建对象
```

​	关于构造方法有几个注意事项：

- 构造方法和类名一致；
- 构造方法没有返回值类型，`void`也不需要写；
- 构造方法中不能写`return`语句；
- 每一个类都有一个默认的无参构造，所以可以不用手动写出来。



## 6.this关键字

​	在有参构造中，我们看到了`this`关键字的使用，这是因为要将参数和属性进行统一命名（见名知义），保持程序的可读性，但如果没有就会产生成员变量和局部变量的命名冲突，在方法中无法访问成员变量。所以Java提供了`this`来指代当前对象，用于在方法中访问对象的其他成员。



## 7.static关键字

​	有时候，在处理问题时需要两个类在**同一个内存区域共享一个数据**。例如，在球类中PI这个常量，可能除了本类需要这个常量外，在另一个圆类中也需要这个常量。这时没有必要再两个类中同时创建PI常量，因为这样系统会将两个不在同一个类中定义的常量分配到不同的内存空间中。为了解决这个问题，可以将这个常量设置未静态的。PI常量在内存中被共享的布局如图所示：

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302202204641.png" alt="image-20230220220423476" style="zoom:50%;" />

​	被生命static的变量、常量、方法被称为静态成员。**静态成员属于类所有**，区别于个别对象，可以在本类后者其他类使用类名和"."调用静态成员。语法如下：

```java
类名.静态成员
```

​	在下面代码中创建了StaticTest类，该类中的主方法调用静态成员并在控制台输出。

```java
// 静态方法的调用
public class StaticTest {
    final static double PI = 3.1415;  // 定义静态常量
    static int id; // 定义静态变量
    
    public static void method1() {
        // do Something
    }
    
    public void method2() {
        System.out.println(StaticTest.PI);
        System.out.println(StaticTest.id);
        StaticTest.method1();
    }
}
```

​	静态方法也可以通过对象"."的方式，但不推荐这种用法，以便和非静态成员分开。

​	静态数据与静态方法的作用通常是为了提供共享数据或方法，如数学计算公式等，以static生命并实现，这样当需要使用时，直接使用类名调用这些静态成员即可。机关使用这种方式调用静态成员比较方便，但静态成员同样遵循public,private,protected修饰符的约束。

​	在StaticTest类中创建书方法调用静态成员并输出：

```java
public class StaticTest {
    final static double PI = 3.1415;  // 定义静态常量
    static int id; // 定义静态变量
    
    public static void method1() {
        // do Something
    }
    
    public void method2() {
        System.out.println(StaticTest.PI);
        System.out.println(StaticTest.id);
        StaticTest.method1();
    }
    public static StaticTest method3() {
        method2();  // 调用非静态方法
        return  this;
    }
}
```

​	我们会发现以上代码会报错，这是因为在静态方法中调用了非静态方法和this关键字的出现，在Java中有两点规定：

- **在静态方法中不可以使用`this`关键字；**
- **在静态方法中不可以直接调用非静态方法。**

**注意：**在Java中规定不能将方法体内的局部变量声明为static的。例如下面代码就是错误的：

```java
public class example{
        puclic void method() {
            static int i = 0;
        }
    }
```

**技巧：**如果在执行类时，希望先执行类的初始化操作，可以使用static定义一个静态区域，例如如下代码，当这段代码执行时，**首先执行static块中的程序，并且只会执行一次**：

```java
public class example {
        static {
            // 
        }
    }
```

- 静态代码块练习：

```java
public class Demo04 {
     static {
        System.out.println("我是静态代码块。。。");
    }
}
```

```java
public class Demo05 {

    public static void main(String[] args) {
        Demo04 d = new Demo04();

        Demo04 d1 = new Demo04();
    }
}
```

![](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302202302516.png)

​	我们发现，创建对象就执行了静态代码块，且执行一次。



- 静态变量的练习：创建Student类，有name、age、schoolName三个属性，在Demo类中分别创建三个对象，使得他们姓名、年龄不同，但学校相同，既可以使用静态变量占用一个内存：

```java
public class Student {
    private String name; // 姓名
    private int age; // 年龄
    private String schoolName; // 大学名称

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                '}';
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}

```

```java
public class Demo01 {
    public static void main(String[] args) {
        Student s01 = new Student();
        s01.setName("张三");
        s01.setAge(20);
        s01.setSchoolName("四川城市职业学院");
		System.out.println(s01);
        System.out.println("===========");

        Student s02 = new Student();
        s02.setName("李四");
        s02.setAge(21);
        s02.setSchoolName("四川城市职业学院");
		System.out.println(s02);
        System.out.println("===========");

        Student s03 = new Student();
        s03.setName("王五");
        s03.setAge(20);
        s03.setSchoolName("四川城市职业学院");
		System.out.println(s03);
    }
}
```

​	以上代码我们发现他们三个对象都一个同一变量值为：“四川城市职业学院”，如果创建三个对象，对应在内存中也要为这个值开辟三个空间，这样浪费了内存，我们可以将schoolName声明为静态变量，这样一个对象赋值，其他对象也可以一并使用了：

```java
// 将Student类的schoolName变为静态变量
private static String schoolName;

// 注释Demo01中s02和s03对schoolName属性的赋值
// s02.setSchoolName("四川城市职业学院");
// s03.setSchoolName("四川城市职业学院");
```

​	运行发现实现了静态变量的共享：

![image-20230220225503595](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302202255723.png)





## 8.继承

​	在现实生活中，说到继承，往往会想到子女继承父类的财产、事业等。在程序中，继承描述的是**事物的所属关系。**例如猫和狗都属于动物，程序中便可以描述猫和狗继承自动物，同理，波斯猫和虎猫继承自猫，中华田园犬和柴犬继承自狗。

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202303032156879.png" alt="image-20230303215610724" style="zoom:50%;" />

​	在Java中，类的继承只在一个现有类的基础上去构建一个新的类，**构建出的新类作为子类，现有的类被称为父类或基类**。子类会自动继承父类**所有的属性和方法**。Java中，以关键字`extends`表达继承关系，`extends`左边的类为子类，右边的类为父类。

​	我们构建一个`Cat`类和`Dog`类，他们都有相同的属性`name`，`age`，`color`，而这些方法都是相同的，可以进行向上抽取，形成父类，然后在父类身上继承：

Cat:

```java
package com.ztr.extend;

public class Cat {
    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

```

Dog:

```java
package com.ztr.extend;

public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

```

​	我们发现除了属性相同外，构造方法也几乎相同。所以我们可以向上抽取父类`Animal`动物类。

Animal:

```java
package com.ztr.extend;


public class Animal {
    private String name;
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void eat() {
        System.out.println("吃饭咯。。。。。");
    }
}

```

删除Dog和Cat的属性方法，并继承Animal：

```java
public class Dog extends Animal{
   
}

```

```java
public class Cat extends Animal{
    
}
```

创建`Demo01`类进行测试：

```java
public class Demo01 {
    public static void main(String[] args) {
        // 创建猫类
        Cat cat = new Cat();
        cat.setName("波斯猫");
        cat.setAge(4);
        cat.setColor("红色");
        cat.eat();
        System.out.println("猫的种类是"+cat.getName()+",年龄是：" + cat.getAge()+",颜色是：" +cat.getColor());
    }
}
```



**注意：Java只支持单继承，一个子类只能继承一个父类，但可以传递继承。**

``` 
public class TigerCat extends Cat {

}
```

​	子类只能继承父类公共的成员，而不能继承私有的成员。

​	继承提高了代码的复用性，提高代码的维护性。



## 9.方法重写

​	在继承关系中，子类会自动继承父类公共的方法，但有时需要在子类中对继承的方法进行修改，即对父类的方法进行重写。

​	重写需要注意的是：

- 子类中重写的方法需要和父类被重写的方法具有**相同的方法名、参数列表以及返回值类型**。

- 子类重写父类方法时，**不能使用比父类中被重写的方法有更严格的访问权限**。

  在`Dog`类和`Cat`类中重写`eat()`方法：

  ```java
  public class Cat extends Animal{
      // @Override强制检查方法是重写的，防止方法名或参数错误
      @Override
      public void eat() {
          System.out.println("猫吃鱼。。。");
      }
  }
  ```

  ```java
  public class Dog extends Animal{
  		@Override
          public void eat() {
              System.out.println("狗吃肉。。。");
      }
  }
  ```

  

  创建`Demo02`类：

```java
/**
 * 方法重写：
 *  1.重写发生在继承关系中
 *  2.当父类提供的方法不能满足子类的要求时，就需要对父类的方法进行重写
 **/
public class Demo02 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        Dog d = new Dog();
        d.eat();
    }
}
```

![image-20230304102007135](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202303041020282.png)

## 10.super

​	问题：在继承关系中，当子类重写父类的方法后，子类对象将无法直接访问父类被重写的方法。

​	解决：`super`关键字就可以用来访问父类的成员，例如访问父类的构造方法、成员变量和成员方法。

