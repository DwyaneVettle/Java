package API.date;

import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        // 无参构造
        Date date = new Date();
        System.out.println(date); // 当前时间

        // 有参构造
        // toLocaleString() 根据本地格式显示时间
        Date date1 = new Date(1682317996857L);
        System.out.println(date1.toLocaleString());

    }
}
