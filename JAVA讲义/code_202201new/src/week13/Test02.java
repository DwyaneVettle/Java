package week13;

import java.util.ArrayList;

/*
*   ArrayList:内部结构是数组，增删时会创建新的数组，效率较低
*       每个元素都有下标，查询非常快
* */
public class Test02 {

    public static void main(String[] args) {
        // 创建ArrayList对象
        ArrayList<Integer> list01 = new ArrayList<>(); // 创建长度为10的集合
        ArrayList<Integer> list02 = new ArrayList<>(list01);
        ArrayList<Object> list03 = new ArrayList<>(41);

        list03.add("夏吉");
        list03.add("黄鑫");

    }
}
