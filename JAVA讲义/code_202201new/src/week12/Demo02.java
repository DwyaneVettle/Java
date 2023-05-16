package week12;

import java.util.Date;

/*
* Date类
*   时间戳：1970-01-01 00：00：00
* */
public class Demo02 {

    public static void main(String[] args) {
        // 无参构造创建对象
        Date d01 = new Date();
        System.out.println(d01);  // 当前时间

        // 有参构造创建对象
        Date d02 = new Date(1683768709);
        System.out.println(d02.toLocaleString());

    }

}
