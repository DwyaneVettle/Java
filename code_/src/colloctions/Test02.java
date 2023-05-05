package colloctions;

import java.util.Comparator;
import java.util.TreeSet;

public class Test02 {

    public static void main(String[] args) {
        TreeSet<Teacher> ts = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher t1, Teacher t2) {
                int result = t1.getAge() - t2.getAge();
                return result;
            }
        });

        Teacher t1 = new Teacher("张三", 20);
        Teacher t2 = new Teacher("李四", 18);
        Teacher t3 = new Teacher("王五", 28);

        ts.add(t1);
        ts.add(t2);
        ts.add(t3);

        System.out.println(ts);

    }
}
