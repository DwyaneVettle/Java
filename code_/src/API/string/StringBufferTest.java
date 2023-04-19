package API.string;

public class StringBufferTest {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb02 = new StringBuffer("Hello");
        System.out.println(sb02.append("World")); // HelloWorld
        System.out.println(sb02.insert(5,"Java")); // HelloJavaWorld
        System.out.println(sb02.deleteCharAt(4)); // HellJavaWorld
        System.out.println(sb02.delete(0,3)); // lJavaWorld
        System.out.println(sb02.replace(0,4,"Python")); // PythonaWorld
        System.out.println(sb02.reverse()); // dlroWanohtyP

    }
}
