package week13;

import java.sql.Array;
import java.util.ArrayList;

/*
for(容器中元素类型 临时变量:容器变量) {
    // 执行语句
}
* */
public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> list01 = new ArrayList<>();
        list01.add("java");
        list01.add("Python");
        list01.add("html");
        list01.add("js");
        /*for (String str: list01) {
            System.out.println(str);
        }*/
        list01.forEach(str -> System.out.println(str));


        // 需求：创建一个有4个元素的数组，用foreach遍历
        String[] arr = {"钟衍涛","周林","王俊","吴青峰"};
        for (String str:arr) {
            System.out.println(str);
        }
    }
}
