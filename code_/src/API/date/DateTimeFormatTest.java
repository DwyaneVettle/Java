package API.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatTest {

    public static void main(String[] args) {
        // 本地日期时间对象
        LocalDateTime ldt = LocalDateTime.now();
        // 通过静态方法格式化对象
        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_DATE_TIME;
        String format = dtf1.format(ldt);
        System.out.println(format);
        // 其他方法参考文档
    }
}
