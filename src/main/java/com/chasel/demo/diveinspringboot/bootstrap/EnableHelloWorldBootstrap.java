package com.chasel.demo.diveinspringboot.bootstrap;

import com.chasel.demo.diveinspringboot.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@link EnableHelloWorld} 引导类
 *
 * @author XieLongzhen
 * @date 2019/3/31 22:04
 */
@EnableHelloWorld
public class EnableHelloWorldBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("helloWorld Bean: " + helloWorld);


        // 关闭上下文
        context.close();
    }
}
