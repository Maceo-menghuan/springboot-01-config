package com.springboot01config.demo;

import com.springboot01config.demo.bean.Person;
import com.springboot01config.demo.calculate.Add;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Autowired
    Add add;

    @Test
    public void testHello() {
        Boolean b = ioc.containsBean("testHello");
        System.out.println(b);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void add() {
        int b = add.add(add.getX(), add.getY());
        System.out.println(b);
    }

}
