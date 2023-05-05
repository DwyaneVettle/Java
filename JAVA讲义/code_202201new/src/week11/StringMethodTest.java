package week11;

public class StringMethodTest {

    public static void main(String[] args) {
            // method03();
            method04();
    }

    private static void method04() {
        /*
        *- `String[] split(String regex)`：将字符串按指定规则切割，返回字符串数组
            - `String trim()`：去除字符串两端空格
        * */

        String s1 = "Java#Mysql#HTML#CSS";
        String[] s2 = s1.split("#");
        //String [] s3 = ["Java","Mysql","HTML","CSS"];
         for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }
         String s4 = "     java   mysql   ";
        System.out.println(s4.trim());

    }

    private static void method03() {
        /* 转换方法
        * - `char[] toCharArray()`：将字符串转为字符数组
        - `byte[] getBytes()`：将字符串转为字节数组
        - `String toUpperCase()`：将字符串转为大写
        - `String toLowerCase()`：将字符串转为小写
        - `String valueOf(int i)`：将数据转为字符串
        * */
        String s1 = "HelloWorld";
        char[] arr = s1.toCharArray();
        // .getClass().getTypeName() 通过反射来获取数据类型
        System.out.println(arr.getClass().getTypeName()); // char[]
        byte[] bytes = s1.getBytes();
        System.out.println(bytes.getClass().getTypeName()); // byte[]
        System.out.println("============");
        System.out.println(s1.toLowerCase());
        System.out.println("============");
        System.out.println(s1.toUpperCase());

        int a = 123;
        String s = String.valueOf(a);
        System.out.println(s);

    }
}
