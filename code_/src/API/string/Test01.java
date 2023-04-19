package API.string;

public class Test01 {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1);

        String s2 = new String();
        System.out.println(s2);

        char[] arr = {'你','好'};
        String s3 = new String(arr);
        System.out.println(s3);

        byte[] arr2 = {97,98,99};
        String s4 = new String(arr2);
        System.out.println(s4); // abc
    }
}
