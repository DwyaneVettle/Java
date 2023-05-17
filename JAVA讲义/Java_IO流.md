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