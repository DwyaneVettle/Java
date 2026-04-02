package com.scuvc.week05;

/**
 * @Description
 * @Author Michealzou@126.com
 * @Date 2026/4/2 15:14
 *
 * 封装：当类不想让对象轻易的访问成员变量和方法时，那么可以使用封装的
 *  思想，让成员变量和方法私有化
 *  方法：使用private修饰变量和方法
 *  private：私有的，只有本类可以访问
 *  如果要想在其他类中的获取该属性或行为，可以使用共有方法去访问私有变量/方法
 *
 **/
public class Person {

    private String name;
    private String gender;
    private int age;

    public Person() {
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    private void eat() {
        System.out.println("人吃饭");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
