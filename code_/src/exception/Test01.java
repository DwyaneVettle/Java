package exception;

import java.io.FileOutputStream;

public class Test01 {

    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            e.printStackTrace();  // 打印异常消息
        } finally {
            System.out.println("这里的代码都会执行。。。");
        }
        
        
    }
    
}
