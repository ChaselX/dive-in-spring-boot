package com.chasel.demo.diveinspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorld 配置
 *
 * @author XieLongzhen
 * @date 2019/3/31 21:38
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello World";
    }
}
