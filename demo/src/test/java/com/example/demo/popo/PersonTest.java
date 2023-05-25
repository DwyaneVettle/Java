package com.example.demo.popo;


import com.example.demo.pojo.Person;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void test01() {
        Person person = new Person();
        person.setName("张三");
        person.setAge(20);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        
    }
}
