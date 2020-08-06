package com.springboot01config.demo.config;

import com.springboot01config.demo.controller.TestHello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wh_yi
 */
@Configuration
public class MyAppConfig {
    @Bean
    public TestHello testHello(){
        System.out.println("这个@bean给容器配置组件");
        return new TestHello();
    }
}
