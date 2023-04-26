package API.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

    public static void main(String[] args) throws ParseException {
        // 公园2023年5月1日  星期一 12:00:00
        SimpleDateFormat sdf = new SimpleDateFormat("Gyyyy年MM月dd日 E HH:mm:ss");
        // 当前日期对象
        Date date = new Date();
        System.out.println(sdf.format(date));

        System.out.println("========");
        // 将一个字符串日期对象解析成日期对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2023-05-01";
        System.out.println(sdf1.parse(str));

    }
}
