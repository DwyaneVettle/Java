package exception;

public class Person {
    
    @Override
    public void finalize() {
        System.out.println("Person对象被回收了。。。");
    }
}
