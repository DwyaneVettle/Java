# Java_方法

## 1.概述

​	方法即被命名的代码块，它可以提高代码的复用性，方法可以传递参数，也可以不传递参数，所以它也能增加代码的灵活性。

​	定义方法的格式为：

```java
修饰符  返回值  方法名(【参数】) {
    方法体；
}
```

​	一个方法的执行分为三个步骤：

- 方法的定义；
- 调用指定方法；
- 执行完毕，返回调用位置。

![image-20230213155138469](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202302171634521.png)

```java
public class Test1_方法 {

       public static void main(String[] args) {
              System.out.println(1);
              f();
			  System.out.println(2);
       }

       private static void f() {
              System.out.println(3);//132
       }
}
```



## 2.方法的参数

​	在实际开发中，有些数据往往是灵活的、不固定的，这时我们就需要在方法的定义中传递参数，以增加程序的灵活性。

```java
//这个类用来测试  方法的传参
//修饰符  返回值  方法名(参数类型  参数名){}
public class Test2_Method2 {
	public static void main(String[] args) {
		//1、调用方法
		add(15) ;
		method(10,5) ;//3、方法传参时，多个参数之间逗号隔开
		function( 10,5,"皮皮虾" ) ;
	}
	public static void function( int a , int b , String c ) {
		//+  在两个数字之间用来做加法运算  
		//+  和字符串做拼接
		System.out.println(a+b+c);//15皮皮虾
	}
	//4、创建method方法，参数列表中，需要匹配参数类型  和  参数名  。
	public static void method(int a , int b) {
		System.out.println(a);
		System.out.println(b);
	}
	//2、创建add方法  ：  参数5 想要成功被接收到，参数的类型 必须和 5的 数据类型保持一致
	public static void add(int a) {
		System.out.println(a);
	}
}
```



## 3.方法返回值

​	在生产过程中，访问用户无法安装IDE来观察程序员用`System.out.println();`输出的结果，这时我们就需要将方法的结果返回到页面指定位置，这时访问用户就可以看到他想要的结果了。

```java
public class tt {
       public static void main(String[] args) {
              System.out.println(1);

              int num=f3(5);
              System.out.println(num);
           
              String str = f4("学习使我快乐");
              System.out.println(str);
              System.out.println(2);
       }

       public static String f4(String desc){
              return desc+",我信你个鬼";
       }

       public static int f3(int i){
              return i*10;
       }
}
```

实现99乘法表：

```java
 public static void main(String[] args) {
        test();
    }
    public static void test() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
```



实现打印三角形：

```java
 public static void test() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三角形的行数：");
        int rows = input.nextInt();
        for(int i = 0;i < rows;i++){
            for(int j = 0; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
```

