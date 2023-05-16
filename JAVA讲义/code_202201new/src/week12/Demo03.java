package week12;

import java.sql.SQLOutput;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Calendar;

/*
* Calendar 操作时间和日期
*   是一个抽象类，不能创建对象
*       获取它的实例对象getInstance()
*   获取月份：0-11
*   获取一周的星期几：从星期天开始的
* */
public class Demo03 {

    public static void main(String[] args) {
        // 获取实例对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        // 获取年月日
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("现在是：" + year + "年" + (month+1) + "月" + day + "号");



        int weekOfDay = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("今天是星期"+(weekOfDay-1));


        System.out.println("================");
        // Clock用于获取指定时区的时间
        Clock clock = new Clock() {
            @Override
            public ZoneId getZone() {
                return null;
            }

            @Override
            public Clock withZone(ZoneId zone) {
                return null;
            }

            @Override
            public Instant instant() {
                return null;
            }
        };


    }
}
