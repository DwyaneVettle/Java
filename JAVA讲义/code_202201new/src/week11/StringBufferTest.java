package week11;

public class StringBufferTest {
    public static void main(String[] args) {
        /*
        StringBuffer append(char c);  // 添加字符到末尾
        StringBuffer insert(int offset,String s);  // 在offset位置插入s
        StringBuffer deleteCharAt(int index);  // 删除index位置的字符
        StringBuffer delete(int start,int end); // 删除从start开始end（不包含）结束的的字符
        StringBuffer replace(int start,int end,String s); // 将start-end的字符用s替换
        void setCharAt(int index,char c); // 修改指定位置处的字符为c
        String toString(); // 返回字符串对象
        StringBuffer reverse();  // 反转
        * */
        
        // 初始化对象的方式
        StringBuffer sb01 = new StringBuffer();
        StringBuffer sb02 = new StringBuffer("Hello");
        StringBuffer sb03 = new StringBuffer(5); // 创建指定容量的缓冲区
        StringBuffer world = sb02.append("World");
        System.out.println(world.hashCode());
        System.out.println(sb02.hashCode());
        System.out.println(sb02.insert(3,456));
        System.out.println(sb02.deleteCharAt(8));
        // 参数是按左开右闭的原则删除的，左边是包含的，右边是不包含的
        System.out.println(sb02.delete(7,9));

        System.out.println(sb02.replace(1,2,"java"));
        System.out.println(sb02.reverse());
    }
}
