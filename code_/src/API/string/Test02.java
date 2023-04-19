package API.string;

public class Test02 {
    public static void main(String[] args) {
        method01();
        System.out.println("==========");
        method02();
        System.out.println("==========");
        method03();
    }

    public static void method01() {
        String s1 = "HelloWorld";
        System.out.println(s1.equals("helloworld")); // false
        System.out.println(s1.equalsIgnoreCase("helloworld")); // true
        System.out.println(s1.startsWith("h")); // false
        System.out.println(s1.endsWith("ld")); // true
        System.out.println(s1.contains("llo")); // true
        System.out.println(s1.isEmpty()); // false
    }
    public static void method02() {
        String s1 = "HelloWorld";
        System.out.println(s1.length()); // 10
        System.out.println(s1.charAt(0)); // H
        System.out.println(s1.indexOf("l")); // 2
        System.out.println(s1.lastIndexOf("l")); // 8
        System.out.println(s1.concat("Java"));
        System.out.println(s1.substring(2)); // lloWorld
        System.out.println(s1.substring(2,8)); // lloWor
    }

    public static void method03() {
        String s1 = "HelloWorld";
        char[] arr =s1.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("========");
        byte[] arr2 =s1.getBytes();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]); // 对应字符的码表值
        }
        System.out.println(s1.toUpperCase()); // HELLOWORLD
        System.out.println(s1.toLowerCase()); // helloworld

        System.out.println(String.valueOf(55));
    }

    public static void method04() {
        String s1 = "Java-Python-Mysql-Html";
        String[] s2 = s1.split("-");
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }
        String s3 = "    Java  Python";
        System.out.println(s3.trim());
    }
}
