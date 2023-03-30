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



**练习：**

```
需求：啤酒2元1瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶
       请问10元钱可以喝多少瓶啤酒，剩余多少个空瓶和盖子？
```

```java
package oop;
/*
* 递归
*   需求：啤酒2元1瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶
*       请问10元钱可以喝多少瓶啤酒，剩余多少个空瓶和盖子？
* */
public class Test01 {

    //定义静态成员变量进行统计最后买的啤酒,默认为0
    public static int totalNumber;     //记录买的啤酒
    public static int totalButtle;    //记录上次剩余的瓶子个数
    public static int totalCover;    //记录上次剩余的盖子个数

    public static void main(String[] args) {
        buy(10);
    }
    /**
     * 进行买啤酒
     * @param money
     */
    private static void buy(int money) {
        int buyNumber = money/2;
        totalNumber += buyNumber;

        //记录当前的瓶子个数、盖子个数
        int buttle = totalButtle + buyNumber;
        int cover = totalCover + buyNumber;

        //将当前的瓶子和盖子转换为金钱，利用递归再次购买啤酒
        int allMoney = 0;
        //先判断瓶子和盖子的个数是否满足可以兑换的数量,
        if (buttle >= 2){
            allMoney += (buttle/2) * 2;
        }
        if (cover >= 4){
            allMoney += (cover/4) * 2;
        }

        //并计算当前剩余的瓶子和盖子的数量
        totalButtle = buttle % 2;
        totalCover = cover % 4;

        //进行判断是否进行递归操作
        if (allMoney >= 2){
            buy(allMoney);
        }else {
            System.out.println(totalNumber+"瓶酒\t\t"+totalButtle+"个瓶子\t\t"+totalCover+"个盖子");
        }
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

​	有时候，在处理问题时需要两个类在**同一个内存区域共享一个数据**。例如，在球类中PI这个常量，可能除了本类需要这个常量外，在另一个圆类中也需要这个常量。这时没有必要再两个类中同时创建PI常量，因为这样系统会将两个不在同一个类中定义的常量分配到不同的内存空间中。为了解决这个问题，可以将这个常量设置为静态的。PI常量在内存中被共享的布局如图所示：

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302202204641.png" alt="image-20230220220423476" style="zoom:50%;" />

​	被声明static的变量、常量、方法被称为静态成员。**静态成员属于类所有**，区别于个别对象，可以在本类后者其他类使用类名和"."调用静态成员。语法如下：

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

​	问题：在继承关系中，当子类重写父类的方法后，子类对象将无法直接访问父类被重写的方法。如果想要访问到父类的方法怎么办呢？

​	解决：`super`关键字就可以用来访问父类的成员，例如访问父类的构造方法、成员变量和成员方法。

```java
public class Demo03 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
}
```

​	如上代码我们只能访问到子类重写后的`eat`方法，如果想要继续访问父类的`eat()`方法怎么办呢？

![image-20230322162900278](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202303221629407.png)

​	此时，我们需要在子类中采用`super`关键字去访问父类的成员，它就可以指代父类：

```java
public class Cat extends Animal{
    // @Override强制检查方法是重写的，防止方法名或参数错误
    @Override
    public void eat() {
        // 通过super关键字调用父类成员
        super.eat();
        System.out.println("猫吃鱼。。。");
    }
}
```

​	这个时候观察`Demo03`类中的输出：

![image-20230322163136214](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202303221631307.png)

​	同理，如果要创建`Cat`类的有参构造方法，我们发现子类`Cat`没有成员变量，也就没有办法通过`this`关键字进行指向，但是父类有这些成员变量，我们可以通过`super`调用到父类的成员变量：

```java
public Cat(String name, int age, String color) {
        super(name, age, color);
}
```



## 11.Object

​	Java为我们提供了一个类`Object`，该类是**所有类的父类**，即每个类都直接或间接继承自该类，所以我们常常称`Object`为**超类、基类**。当定义一个类时，如果没有关键字`extends`进行指向，那么该类就会默认继承自`Object`。

```java
public class Person  extends Object{
    private String name;
    private int age;
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
```

​	继承`Object`后，就可以用到父类的`toString`方法等，并可以重写父类的`toString`方法。按住`Ctrl`键点击`Object`就可以看到它的所有的方法，子类都可以使用。

```java
public class Demo01 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p); // 包名+类名+地址值
        System.out.println(p.toString());
        System.out.println(p.getClass()); // class Object.Person
    }
}
```

​	`Object`类的常用方法如下：

| 方法声明          | 功能描述                                                     |
| ----------------- | ------------------------------------------------------------ |
| boolean  equals() | 指示其他某个对象是否与此对象“相等”                           |
| class getClass()  | 返回此 `Object` 的运行时类                                   |
| int  hashCode()   | 返回该对象的哈希码值                                         |
| String toString() | 返回该对象的字符串表示                                       |
| void finalize()   | 当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法 |



## 12.final关键字

​	`final`关键字可用于**修饰类、变量和方法**。它有"不可更改"或"最终的"的含义，因此被`final`修饰后都有以下特点：

- final修饰的类不能继承
- final修饰的方法不能被重写
- fianl修饰的变量是常量，只能赋值一次

Animal类被`final`修饰后不能被Dog类继承，并且Animal类的方法被`final`修饰后也不能被重写：

```java
public final class Animal {
    public final void eat() {
        System.out.println("Animal方法");
    }
}
```

```java
public class Dog extends Animal {
    public void eat() {
        System.out.println("子类重写的方法。。");
    }
}
```

报错信息：

![image-20230322170144434](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202303221701570.png)

```java
public class Demo02 {
    public static void main(String[] args) {
        final int a = 10;
        a = 20;
        
    }
}
```

​	`final`修饰的变量将不允许被修改：

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202303221703374.png" alt="image-20230322170316265" style="zoom:33%;" />

## 13.抽象类

​	普通类是一个完整的功能类，可以直接产生实例化对象，并且在普通类中可以包含有构造方法、普通方法、static方法、变量、常量等。而抽象类是指在普通类的结构内部增加抽象方法的组成部分。

​	那么什么是抽象方法呢？在所有的普通方法内部都有"{}"表示方法体，有方法体的方法一定是能够被对象直接访问的。而**抽象方法是没有方法体的方法，同时抽象方法还必须使用关键字`abstract`关键字修饰**。**当我们进行父类方法的抽取时，有些方法每个子类的实现都不一样，这个时候我们就该把这个方法定义为抽象方法。**

​	**拥有抽象方法的类就是抽象类，抽象类要使用`abstract`关键字声明**。

​	定义`Animal`类。除了基本的属性外，有两个方法`eat`和`sleep`，其中`eat`方法为抽象方法，因为不知道每个具体的子类怎么实现：

```java
package abstract_test;

public abstract class Animal {
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
    // 抽象方法
    public abstract void eat();

    public void sleep() {
        System.out.println("睡觉了...");
    }
}

```

​	子类`Dog`和`Cat`，重写抽象方法，实现子类的需求：

```java
package abstract_test;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼。。。");
    }
}

```

```java
package abstract_test;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉。。。");
    }
}

```

​	测试类：

```java
package abstract_test;

public class Test01 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();

        System.out.println("=======");

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();


    }
}
```

​	运行结果：

![image-20230324093810093](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202303240938256.png)

​	需要注意的是：**抽象类不能直接创建对象使用**：

![image-20230324094019922](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202303240940033.png)





## 14.接口

​	如果一个抽象类中所有的方法都是抽象的，则可以将这个类定义称另一种形式---**接口**。接口是一种特殊的抽象类，它不能包含普通方法，其内部的所有方法都是抽象方法，它将抽象进行得更为彻底。

​	在JDK8中对抽象类进行了重新定义，接口中除了抽象方法外，还可以有默认方法和静态方法，默认方法使用`default`修饰，静态方法使用`static`修饰，并且这两种方法都允许有方法体。

​	接口的定义使用了关键字`interface`来声明，语法格式如下：

```java
[修饰符]  interface  接口名{
    public static final 常量类型  常量名 = 值;
    public abstract 返回值  方法名(参数);
    public default 返回值  方法名(参数){}
    public static 返回值  方法名(参数){}
}
```

​	接口都需要通过类去实现其功能，实现的关键字为`implement` 。它打破了Java单继承的局限，因为Java支持**多实现**。

​	**注意：**接口不能有构造方法，也就不能直接创建对象使用。

​	定义接口`Animal`：

```java
public interface Animal {

    public static final int ID = 1; // 常量id

    // 抽象方法
    public abstract void breath();

    // 默认方法
    public default void getType(String type) {
        System.out.println("当前动物属于" + type);
    }
    // 静态方法
    public static int getId() {
        return ID;
    }
}

```

​	再定义接口`LandAnimal：`

```java
public interface LandAnimal {
    void run();
}
```



​	创建`Dog`类实现接口`Animal`：

```java
public class Dog implements Animal,LandAnimal{
    @Override
    public void breath() {
        System.out.println("狗在呼吸。。。");
    }

    @Override
    public void getType(String type) {
        Animal.super.getType(type);
    }

    @Override
    public void run() {
        System.out.println("狗可以跑。。");
    }
}


```

​	创建测试类：

```java
public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breath();
        dog.getType("犬科");
        dog.run();
    }
}

```

​	运行结果：

![image-20230324100126340](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202303241001431.png)



## 15.多态

​	在Java中，多态指不同类的对象在调用同一个方法时所呈现出的多种不同行为。通过多态，消除了类之间的耦合关系，大大提高了程序的可拓展性和可维护性。

​	多态的前提条件：

- 继承或实现关系
- 有方法的重写
- 父类引用指向子类对象

```java
public class Aniaml {
    int age = 2;
    public void eat() {
        System.out.println("动物吃肉。。。");
    }
}
```

```java
public class Dog extends Aniaml{
	int age = 5;
    @Override
    public void eat() {
        System.out.println("狗吃肉。。。");
    }
}
```

```java
public class Test {
    public static void main(String[] args) {
        // 父类引用指向子类对象--多态的提现
        Aniaml a = new Dog();
        System.out.println(a.age); // 2-父类的
        a.eat(); // 狗吃肉
    }
}
```

​	多态的成员访问特点：

- 成员变量：编译看父类，访问父类的成员变量
- 成员方法：编译看父类，运行看子类



## 16.内部类

​	在Java中，允许一个类的内部定义类，这样称为内部类，这个类所在的类称为外部类。Java内部类分为：成员内部类、局部内部类、静态内部类、匿名内部类。

### 16.1.成员内部类

```java
// 成员内部类
public class Outer {
    // 外部类的成员变量和方法
    int outer = 10;
    public void outerMethod() {
        System.out.println("我是外部类方法。");
    }
    // 成员内部类
    class Inner {
        // 内部类的成员变量和方法
        int inner = 20;
        public void innerMethod() {
            System.out.println("我是内部类的方法。。");
            System.out.println(outer);
            outerMethod();
        }
    }
}
```



```java
/*
*   创建内部类对象的格式：外部类.内部类 对象名 = new 外部类对象().new 内部类对象()
*       内部类可以访问内部类的成员
* */
public class Test01 {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.innerMethod();
        System.out.println(oi.inner);
    }
}
```



### 16.2.局部内部类

​	局部内部类指在一个方法中定义类。我们在上述`Outer`中定义方法，并在方法中定义局部内部类：

```java
public void method01() {
        class Inner01 {
            int inner01 = 30;
            public void method02() {
                System.out.println("局部内部类的方法。");
            }
        }
```

​	局部内部类的局限性很大，它只能在该声明方法中去创建对象，一般很少使用这种方式创建内部类。



### 16.3.静态内部类

​	静态内部类即用`static`关键字声明成员内部类，它创建对象的方式为：

```java
外部类名.静态内部类名 对象名 = new 外部类名.静态内部类名();
```

​	在`Outer`中添加静态内部类：

```java
static class Inner02 {
        int inner02 = 40;
        public void method03() {
            System.out.println("静态内部类方法" + inner02);
            // System.out.println(outer);不能使用外部类，静态类先存在，如果要访问，必须将外部变量设置为静态
        }
    }
```

​	创建测试类：

```java
public class Test02 {
    public static void main(String[] args) {
        Outer.Inner02 oi = new Outer.Inner02();
        System.out.println(oi.inner02);
        oi.method03();
    }
}

```

![image-20230324115306861](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202303241153985.png)





### 16.4.匿名内部类

​	匿名内部类即是没有名字的内部类。定义的格式为：

```java
new 类名/接口名() {
    // 重写抽象方法
}
```

​	内部类可以独立地继承或实现一个类的接口，无论外部类是否继承或实现，内部类不受影响。

```java
public abstract class Animal {

    abstract void eat();
}
```



```java
public class Test {

    public static void main(String[] args) {
        // 等效于Animal父类的子类对象
        // 第一种直接调用方式
        /*new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃肉");
            }
        }.eat();*/
        // 第二种返回对象调用
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃肉");
            }
        };
        a.eat();
    }
}
```

