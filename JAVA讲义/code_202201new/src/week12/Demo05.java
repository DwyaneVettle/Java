package week12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// DateTimeFormatter 使用方式和SimpleDateFormat相似
// 通过静态方法格式化对象 format()
public class Demo05 {

    public static void main(String[] args) {
        // 获取本地时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        // 用静态方法获取DateTimeFormatter对象
        DateTimeFormatter idt = DateTimeFormatter.ISO_LOCAL_DATE;
        String format = idt.format(now);
        System.out.println(format);



    }
}
