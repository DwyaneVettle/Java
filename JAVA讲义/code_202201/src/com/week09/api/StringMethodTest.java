package com.week09.api;

public class StringMethodTest {

    public static void main(String[] args) {
            // method01();
            // method02();
        method03();
    }

    public static void method01() {
        /* 判断方法
        *   - `boolean equals(String S)`：判断两个字符串是否相同，区分大小写
            - `boolean equalsIgnoreCase(String s)`：判断两个字符串是否相同，忽略大小写
            - `boolean startsWith(String s)`：判断当前字符串是否以s开头
            - `boolean endsWith(String s)`：判断当前字符串是否以s结尾
            - `boolean contains(String s)`：判断当前字符串是否包含s
            - `boolean isEmpty()`：判断字符串是否为空
            * */
        String s01 = "HelloWorld";
        System.out.println(s01.equals("helloworld"));  // false
        System.out.println(s01.equalsIgnoreCase("helloworld"));  // true
        System.out.println(s01.startsWith("h")); // false
        System.out.println(s01.endsWith("d")); // true
        System.out.println(s01.contains("llo"));  // true
        System.out.println(s01.isEmpty()); // false
    }

    public static void method02() {
        /*获取方法
        *   - `int length()`：返回字符串的长度
            - `char charAt(int index)`：返回对应索引的字符
            - `int indexOf(String s)`：返回s的第一次索引位置
            - `int lastIndexOf(String s)`：返回s最后一次索引位置
            - `String concat(String s)`：拼接字符转
            - `String substring(int index)`：从指定位置到结尾截取字符串
            - `String substring(int start,int end)`：从start开始到end结束截取字符串，左开右闭*/
        String s02 = "HelloWorld";
        System.out.println(s02.length()); // 10
        System.out.println(s02.charAt(5)); // W
        System.out.println(s02.indexOf("l")); // 2
        System.out.println(s02.lastIndexOf("l")); // 8
        System.out.println(s02.concat("java")); // HelloWorldjava
        System.out.println(s02.substring(5)); // World
        System.out.println(s02.substring(5,7)); // Wo
    }
    
    public static void method03() {
        /*
        - `char[] toCharArray()`：将字符串转为字符数组
        - `byte[] getBytes()`：将字符串转为字节数组
        - `String toUpperCase()`：将字符串转为大写
        - `String toLowerCase()`：将字符串转为小写
        - `String valueOf(int i)`：将数据转为字符串
        * */
        
        String s1 = "HelloWorld";
        char[] arr = s1.toCharArray();
        System.out.println(arr);
    }
}
