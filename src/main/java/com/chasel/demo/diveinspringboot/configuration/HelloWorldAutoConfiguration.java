package com.chasel.demo.diveinspringboot.configuration;

import com.chasel.demo.diveinspringboot.annotation.EnableHelloWorld;
import com.chasel.demo.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorld 自动装配
 *
 * @author XieLongzhen
 * @date 2019/4/21 13:56
 */
@Configuration // Spring 模式注解装配
@EnableHelloWorld // Spring @Enable 模块装配
@ConditionalOnSystemProperty(name = "user.name", value = "Administrator") // 条件装配
public class HelloWorldAutoConfiguration {

}
