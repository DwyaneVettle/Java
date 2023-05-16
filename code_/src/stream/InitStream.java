package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
