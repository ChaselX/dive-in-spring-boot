package com.chasel.demo.diveinspringboot.configuration;

import org.springframework.context.annotation.Bean;

/**
 * HelloWorld 配置
 *
 * @author XieLongzhen
 * @date 2019/3/31 21:38
 */
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello World";
    }
}
