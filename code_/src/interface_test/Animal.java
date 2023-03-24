package interface_test;

public interface Animal {

    public static final int ID = 1; // 常量id

    // 抽象方法
    public abstract void breath();

    // 默认方法
    public default void getType(String type) {
        System.out.println("当前动物属于" + type);
    }
    // 静态方法
    public static int getId() {
        return ID;
    }
}
