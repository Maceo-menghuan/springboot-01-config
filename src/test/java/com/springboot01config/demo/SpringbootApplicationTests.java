package com.springboot01config.demo;

import com.springboot01config.demo.bean.Person;
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
    @Test
    public void testHello(){
        Boolean b = ioc.containsBean("testHello");
        System.out.println(b);
    }
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
