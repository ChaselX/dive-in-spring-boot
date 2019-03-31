package com.chasel.demo.diveinspringboot.annotation;

import com.chasel.demo.diveinspringboot.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 激活 Hello World 模块
 *
 * @author XieLongzhen
 * @date 2019/3/31 21:31
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HelloWorldConfiguration.class)
public @interface EnableHelloWorld {
}
