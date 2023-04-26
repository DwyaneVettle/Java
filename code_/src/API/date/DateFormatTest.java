package API.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatTest {

    public static void main(String[] args) throws ParseException {
        // 创建完整格式化时间对象
        DateFormat df01 = DateFormat.getDateInstance(DateFormat.FULL);
        // 创建长格式化时间对象
        DateFormat df02 = DateFormat.getDateInstance(DateFormat.LONG);
        // 创建标准格式化时间对象
        DateFormat df03 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        // 创建段格式化时间对象
        DateFormat df04 = DateFormat.getDateInstance(DateFormat.SHORT);


        Date date = new Date(); // 当前时间
        System.out.println("完整版格式为：" + df01.format(date));
        System.out.println("长格式为：" + df02.format(date));
        System.out.println("标准格式为：" + df03.format(date));
        System.out.println("短格式为：" + df04.format(date));


        // 将字符串日期解析成日期对象
        String s = "2023年5月1日";
        System.out.println(df02.parse(s));
    }
}
