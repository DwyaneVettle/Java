package week15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
*   Stream流是JDK8新增的一个特性，和 Lambda表达式配合使用，用于
*   简化集合的操作
* */
public class Test02 {

    public static void main(String[] args) {
        int[] arr = {123,345,789,100};
        // 第一种：通过Arrays.stream()
        IntStream s1 = Arrays.stream(arr);
        s1.forEach((int i) -> {
            System.out.println(i);
        });
        
        // 第二种：Stream.of()
        Stream<String> s2 = Stream.of("aa", "bb", "cc");
        s2.forEach((String a) -> {
            System.out.println(a);
        });
        
        // 第三种：通过单列集合
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        Stream<String> s3 = list.stream();
        s3.forEach((String s) -> {
            System.out.println(s);
        });
    }
}
