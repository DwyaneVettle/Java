# Java_IO流

![image-20230516222955028](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305162230194.png)

​	I/O(Input/Output)流：即输入输出流。是Java中实现输入输出的基础，它可以方便的实现数据的输入输出操作。

​	I/O流分为以下几类：

- **字节流和字符流**：根据流操作单位的不同分类；
- **输入输出流：**根据流传输方向的不同分类；
- **节点流和处理流：**根据流的功能不同分类。

 

​	Java中I/O流主要定义在`java.io`包中，该包下定义了很多类，其中有4个类为流的顶级类，分为`InputStream`和`OutputStream`、`Reader`和`Writer`。

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305172102129.png" alt="image-20230517210212994" style="zoom: 67%;" />

​	以上4个顶级类都是抽象类，并且是所有流类型的父类。

## 1.字节流

​	在计算机中，无论文本、图片、音频还是视频，所有的文件都是以二进制（字节）的形式存在的。I/O流中针对字节的输入/输出提供了一系列的流，统称为字节流。字节流是程序中最常用的流，在JDK中**所有的字节输入流都继承自`InputStream`，所有的字节输出流都继承自`OutputStream`**。

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305172120992.png" alt="image-20230517212025925" style="zoom:50%;" />

- `InputStream`常用方法：

  - `int read()`：从输入流读取一个8为的字节，把它转换为0-255之间的整数，当没有可用字节时则返回-1
  - `int read(byte[] b)`：从输入流读取若干字节，把它们保存到参数b指定的字节数组中，返回的整数表示读取字节的整数
  - `int read(byte[] b,int off,int len)`：从输入流读取若干字节，把它们保存到参数b指定的字节数组中，off指指定字节开始保存数据的下标，len表示读取字节的长度
  - `void close()`：关闭此输入流并释放资源

- `OutputStream`常用方法：

  - `void write(int b)`：向输入流写出一个字节
  - `void write(byte[] b)`：把参数b指定的字节数组的所有字节写到输出流
  - `void write(byte[] b,int off,int len)`：将指定byte数组中从偏移量off开始的len个字节写入输出流
  - `void flush()`：刷新此输出流并强制写出所有的缓冲字节
  - `void close()`：关闭此输出流并释放资源

  针对文件的读写，JDK专门提供了两个类`FileInputStream`和`FileOutputStream`，它们专门用于读取/写入文件中的数据。从文件读取数据是重复的操作，因此需要通过循环语句来实现数据的持续读取。

```java
public class Test01 {

    public static void main(String[] args) throws IOException {
        // 1.创建字节输入流对象
        FileInputStream fs = new FileInputStream("D:\\a.txt");
        
        // 2.读取文件中的数据
        int read = fs.read();
        /*System.out.println(read); // 97-字节
        System.out.println(read); // 98
        System.out.println(read); // 99
        System.out.println(read); // -1*/
        int i = 0;
        while((i = fs.read()) != -1){
            System.out.println((char)read); // 强制转换
        }
        // 3.关闭资源 --如果不关闭资源，下面的死循环仍占用文件资源，导致不能删除等操作
        fs.close();
        
        /*while (true) {
            
        }*/
        
    }
}
```

​	输出流写出数据时，如果关联的文件已经存在，会将原有内容情况掉后再次写入，如果不想清空原有内容，就可以在构造方法的位置，加入ture的开关即可：

![image-20230517215848208](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305172158262.png)

```java
public class Test02 {

    public static void main(String[] args) throws IOException {
        // 1.创建字节输出流对象
        FileOutputStream fs = new FileOutputStream("D:\\1.txt");
        // 2.写出数据
        fs.write(97);
        byte[] bytes = "你好".getBytes();
        fs.write("\r\n".getBytes()); // 回车换行转义字符
        fs.write(bytes);
        
        // 3.关闭资源
        fs.close();
    }
}
```



文件的拷贝：

```java
/*
完成文件拷贝
    1.创建输入/输出流对象
            输入流对象关联要拷贝的数据源
            输出流对象关联要拷贝数据的目的
    2.在读取的过程中，将数据写到目标文件中
    3.关闭资源
*/
public class TestCopy {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 1.创建输入输出流对象
            fis = new FileInputStream("D:\\1.txt");
            fos = new FileOutputStream("D:\\softtest\\copy.txt");

            // 2.在读取过程中，将数据写出到目标文件
            int i;
            while((i = fis.read()) != -1) {
                fos.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    // 3.关闭资源
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    // 3.关闭资源
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
        }
    }
}
```

​	我们通过以上文件拷贝文件时所需的时间很快，但如果是拷贝的视频、音频效率就不高了，我们还是以上面代码为例，将文件改为视频，该视频大小为8MB，并计算拷贝所需时间：

```java
public class TestCopy {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 1.创建输入输出流对象
            fis = new FileInputStream("D:\\demo.wmv");
            fos = new FileOutputStream("D:\\softtest\\copy.wmv");

            // 2.在读取过程中，将数据写出到目标文件
            int i;
            while((i = fis.read()) != -1) {
                fos.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    // 3.关闭资源
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    // 3.关闭资源
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000);
    }
}

```

所需时间：

![image-20230517222800189](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305172228256.png)

​	假设从成都运送快递到北京，如果有一万件快递，一件一件运送就必须运送一万次。我们上面的代码就是从`demo.mp4`中每读到一个字节再写入字节到`copy.mp4`中。在实际生活中，我们把快递放入火车厢或飞机仓中成批运送快递，效率就增加了很多。

​	同理：在文件拷贝过程中，通过以字节形式逐个拷贝，效率非常低。为此可以定义一个字节数组缓冲区，在拷贝时就可以一次性读取多个字节数据。

```java
public class TestCopyBuffer {

    public static void main(String[] args) throws FileNotFoundException {
        
        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 1.创建输入输出流对象
            fis = new FileInputStream("D:\\demo.wmv");
            fos = new FileOutputStream("D:\\copy.wmv");

                // 2.创建缓冲区
            byte[] bytes = new byte[1024];

            // 3.在读取过程中，将数据写出到目标文件
            int i;
            while((i = fis.read(bytes)) != -1) {
                fos.write(i);
            }
        } catch (
        IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    // 4.关闭资源
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    // 3.关闭资源
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000);
        }
}
```

所需时间：

![image-20230517223421863](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305172234917.png)

## 2.字节缓冲流

​	上面的案例中，我们通过创建了一个字节数组作为文件拷贝的缓冲区以提交文件拷贝效率外，I/O中还提供了两个字节缓冲流来提高文件拷贝效率：`BufferedInputStream`和`BufferedOutputStream`。它们的构造方法中分别接收`InputStream`和`OutputStream`类型的参数作为对象，在读写数据时提供缓冲功能。

​	缓冲流示意图：

![image-20230519213216539](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305192132674.png)

```java
public class BufferedInputStreaTest {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        // 1.创建对象
        FileInputStream is = new FileInputStream("D:\\demo.wmv");
        FileOutputStream os = new FileOutputStream("D:\\test.wmv");
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(os);
        // 2.读写操作
        int i;
        while((i = bis.read()) != -1) {
            bos.write(i);
        }
        bos.close();
        bis.close();
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000);
    }
}
```



## 3.字符流

​	除了字节流，JDK还提供了实现字符操作的字符流，同字节流一样，字符流也有两个抽象的顶级父类，分别是`Reader`和`Writer`。那么有了字节流，为什么还用字符流呢？我们用如下案例进行演示：

​	我们创建一个`1.txt`文件，该文件中有4个汉字“你好你好”，并用字节流读取这几个汉字，我们发现，这几个汉字乱码了：

```java
public class Test03 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("1.txt"); // 文件和src同级
        
        int i;
        while((i = fis.read()) != -1) {
            System.out.println((char)i);
        }
        fis.close();
    }
}
```

​	乱码：

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305192156539.png" alt="image-20230519215649478" style="zoom:50%;" />

​	出现乱码的原因是因为在ASCII码中，**一个英文字母（部分大小写字母）占一个字节空间，一个中文汉字占两个字节的空间，在UTF-8编码集中，一个中文占3个字节**。字节流只能一个字节一个字节的读取，所以出现了乱码。

​	想从文件中读取字符便可以使用字符输入流`FileReader`，通过此流可以从文件中读取一个或一组字符。

```java
public class ReaderTest {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("1.txt");
        int i;
        while((i = fr.read()) != -1) {
            System.out.println((char)i);
        }
        fr.close();
    }
}
```

输出结果：

<img src="https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305192211363.png" style="zoom:50%;" />

​	

​	我们发现字符流可以解决中文乱码的问题，它是通过字节流+编码表的形式进行的。

​	字符流写入文件：

```java
public class WriterTest {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("1.txt",true);
        fw.write("\r\n哈哈");
        fw.close();
    }
}
```

![image-20230519222038628](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202305192220683.png)



## 4.字符缓冲流

​	与字节缓冲流一样，Java也提供了字符缓冲流，以解决字符文件输入输出的效率。这两个字符输入/输出流分别为`BufferedReader`和`BufferedWriter`。`BufferedReader`提供了一个`readLine()`方法，它可以一次读取一整行字符串，`BufferedWriter`提供了一个`newLine()`方法，它可以写出回车换行，此方法具有跨平台效果（不通操作系统的回车换行符不一样，如windows为\r\n，Linux为\n）。

​	我们还是以文件的拷贝为例：

```java
public class Copy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        
        String line;
        while((line = br.readLine()) != null) {
            bw.write(line);
        }
        br.close();
        bw.close();
    }
}
```



## 5.File类

​	`File`类用于封装一个路径，这个路径可以是从系统盘符开始的绝对路径，也可以是相对于当前目录而言的相对路径。封装的路径可以指向一个文件，也可以指向一个目录，在`File`类中提供了针对这些文件或目录的一些常规操作。

​	`File`类常用构造方法：

| 方法                             | 说明                                                         |
| -------------------------------- | ------------------------------------------------------------ |
| File(String pathname)            | 通过指定字符串类型文件路径来创建一个新的File对象             |
| File(String parent,String child) | 指定一个字符串类型的父路径和一个字符串类型子路径（包括文件名称）创建一个File对象 |
| File(File parent,String child)   | 指定一个File类型的父路径和一个字符串类型子路径（包括文件名称）创建一个File对象 |

