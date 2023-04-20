package com.week09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test01 {

    public static void main(String[] args) throws FileNotFoundException {
        // 需求：两数相除
        try {
            int num01 = 10;
            int num02 = 0;
            System.out.println(num01 / num02);
        } catch (Exception e) {
            // System.out.println(e);
            // e.getMessage();
            e.printStackTrace();
        }
        System.out.println("hello");



        FileOutputStream fs = new FileOutputStream("");


    }
}
