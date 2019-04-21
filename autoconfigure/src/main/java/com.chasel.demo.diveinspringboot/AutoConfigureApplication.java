package com.chasel.demo.diveinspringboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.chasel.demo.diveinspringboot.web.servlet")
public class AutoConfigureApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(AutoConfigureApplication.class)
				.run(args);
//		SpringApplication.run(DiveInSpringBootApplication.class, args);
	}

}
