package com.scuvc.week01;

/**
 * @Description 数据类型
 * @Author Michealzou@126.com
 * @Date 2026/3/10 16:24
 **/
public class Demo02 {

    public static void main(String[] args) {
        /*
        数据类型：整数类型
            byte:1字节 -128~127
            short:2字节 -32768~32767
            int:4字节 -2147483648~2147483647
            long:8字节 -9223372036854775808~9223372036854775807
        浮点类型：小数
            float:4字节，单精度，对小数精度要求不高
            double:8字节，双精度，对小数精度要求高
        字符类型：字符 ''
            char:2字节，存储Unicode字符，用单引号括起来

        布尔类型：true/false
            boolean:1字节，true/false
        * */
        byte a = 10;
        // byte b = 200;
        short c = 30000;
        // short d = 40000;
        int e = 2147483647;
        // int f = 34309589348534657;

        // float类型的数据不要用户计算中
        float g = 1.01f;
        float h = 2.02f;
        System.out.println(g + h);
        double i = 1.01;
        double j = 2.02;
        System.out.println(i + j);

        char k = 'a';
        System.out.println(k);
        char l = 97;
        System.out.println(l); // a

        boolean m = true;
        boolean n = false;
    }
}
