package com.week05;

import java.io.File;

/*
* 读取本地文件夹下的文件夹和文件
* */
public class Test06 {

    public static void showDirct(File file) {
        File[] files = file.listFiles();
        /*
        * foreach()循环：File表示类型，a遍历定义的变量=i，files表示要遍历的对象
        * */
        for (File a:files) {
            // getAbsolutePath()获取绝对路径
            System.out.println(a.getAbsolutePath());
            // isDirectory()是否为文件夹
            if(a.isDirectory()) {
                showDirct(a);
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("D:\\笔记\\Java\\JAVA讲义");
        showDirct(file);
    }
}
