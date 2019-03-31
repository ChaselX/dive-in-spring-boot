package com.chasel.demo.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.chasel.demo.diveinspringboot.web.servlet")
public class DiveInSpringBootApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DiveInSpringBootApplication.class)
				.run(args);
//		SpringApplication.run(DiveInSpringBootApplication.class, args);
	}

}
