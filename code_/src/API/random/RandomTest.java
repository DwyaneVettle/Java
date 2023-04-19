package API.random;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.println(r.nextBoolean());
        System.out.println(r.nextDouble());
        System.out.println(r.nextFloat());
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(100));
        System.out.println(r.nextLong());
    }
}
