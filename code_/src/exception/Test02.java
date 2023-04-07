package exception;

public class Test02 {

    public static void main(String[] args) {
        try {
            getAge(-23);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void getAge(int age) throws Exception {
        if(age < 0 || age > 200) {
            throw new Exception("年龄不合法！");
        } else {
            System.out.println("年龄是:" + age);
        }
    }
}
