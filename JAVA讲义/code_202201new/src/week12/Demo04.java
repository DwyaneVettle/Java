package week12;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
*   SimpleDateFormat:按照特定的格式对时间进行格式化
*       new SimpleDateFormat("日期时间的格式").format(当前时间)
*   format()--格式化时间
* */
public class Demo04 {

    public static void main(String[] args) {
        // 公元2023年5月11日
        SimpleDateFormat sdf01 = new SimpleDateFormat();
        SimpleDateFormat sdf02 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf03 = new SimpleDateFormat("EEE, MMM d, ''yy");
        Date date = new Date();// 获取当前时间
        System.out.println(date);
        System.out.println(sdf02.format(date)); // 2023年05月11日 10:35:59
        System.out.println(sdf01.format(date)); // 23-5-11 上午10:35
        System.out.println(sdf03.format(date)); // 23-5-11 上午10:35


        SimpleDateFormat sdf04 = new SimpleDateFormat("yy/MM HH:mm");
        System.out.println(sdf04.format(date));
    }
}
