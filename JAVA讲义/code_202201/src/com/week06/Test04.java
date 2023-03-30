package com.week06;

public class Test04 {

    public static void main(String[] args) {
        // 创建对象，给属性赋值
        Student s01 = new Student();
        s01.setName("何郑强");
        s01.setAge(18);
        s01.setSchoolName("四川城市职业学院");
        System.out.println(s01);
        System.out.println("===========");


        Student s02 = new Student();
        s02.setName("周林");
        s02.setAge(18);
        // s02.setSchoolName("四川城市职业学院");
        System.out.println(s02);
        System.out.println("===========");

        Student s03 = new Student();
        s03.setName("席懿");
        s03.setAge(19);
        // s03.setSchoolName("四川城市职业学院");
        System.out.println(s03);
        System.out.println("===========");
    }
}
