package com.chasel.demo.diveinspringboot.bootstrap;

import com.chasel.demo.diveinspringboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@link CalculateService} 引导类
 *
 * @author XieLongzhen
 * @date 2019/4/16 19:24
 */
@SpringBootApplication(scanBasePackages = "com.chasel.demo.diveinspringboot.service")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);

        CalculateService calculateService = context.getBean(CalculateService.class);
        System.out.println("calculateService.sum(1...10): " + calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));


        // 关闭上下文
        context.close();
    }
}
