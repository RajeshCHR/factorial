package com.mindfire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class FactorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactorialApplication.class, args);
	}

}
