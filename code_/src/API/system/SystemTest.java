package API.system;

public class SystemTest {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.exit(0);
            }
            System.out.println(i); // 0,1,2,3,4
        }*/

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.arraycopy(src,1,dest,3,2);
        for (int i = 0; i < dest.length; i++) {
            System.out.print(dest[i] + " "); // 6,7,8,2,3
        }

        System.out.println(System.getProperties());
        System.out.println(System.getProperty("os.name"));
    }
}
