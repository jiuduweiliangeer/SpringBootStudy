package com.example.internet.demo;

import com.example.internet.demo.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    Person person;
    @Test
    void contextLoads() {
        System.out.println(person);
    }
    @Autowired
    ApplicationContext ioc;
    @Test
    void testController(){
        boolean s=ioc.containsBean("helloService");
        System.out.println(s);
    }

}
