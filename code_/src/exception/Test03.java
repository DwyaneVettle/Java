package exception;

public class Test03 {
    public static void main(String[] args) {
        try{
            divide(10,0);
        } catch (MyException me) {
            me.printStackTrace();
        }
    }
    
    public static void divide(int num1,int num2) throws MyException {
        if(num2 < 0 || num2 == 0) {
            throw new MyException("除数不能为0或负数。。");
        } else {
            System.out.println(num1 / num2);
        }
    }
}
