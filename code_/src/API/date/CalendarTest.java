package API.date;

import java.util.Calendar;

public class CalendarTest {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); // 获取到当前时间
        System.out.println(cal);
        // 获取年月日
        int month = cal.get(Calendar.MONTH);
        System.out.println(month);  // 0-11
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        int day = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(day); // 一周中第几天，从星期天开始

    }
}
