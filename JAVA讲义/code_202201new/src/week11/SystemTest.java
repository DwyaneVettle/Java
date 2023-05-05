package week11;


/*
* 1.System.exit(); 终止Java虚拟机，如果为0是正常终止，非0为非正常终止
* 2.System.currentTimeMillis();以毫秒为单位获取时间
* 3.static void arraycopy(Object src,
* int srcPos,Object dest,int destPos,int length)
* 按照指定的位置复制数组，src为源数组，dest为目标数组
* 下标不能越界
* 4.System.getProperties();获取当前系统的属性
* */
public class SystemTest {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10 ; i++) {
//            // 当输出数字5时，终止程序
//            if (i == 5) {
//                System.exit(0);
//            }
//            System.out.println(i);
//        }
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            System.out.println(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println((end - start) / 1000);

        int[] src = {1,2,3,4};
        int[] dest = {6,7,8,9,10};
        System.arraycopy(src,1,dest,3,2);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }

        System.out.println(System.getProperties());

        System.out.println(System.getProperty("os.name"));
    }
}
