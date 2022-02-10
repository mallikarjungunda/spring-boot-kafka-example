package com.examples.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication	// same as @ComponentScan, @Configuration, @EnableAutoConfiguration
public class SpringBootSimpleEx {
	
	private static Logger logger = LoggerFactory.getLogger(SpringBootSimpleEx.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleEx.class, args);
		
//		new SpringApplicationBuilder(SpringBootSimpleEx.class)
//		.properties("spring.config.name:conf")
//		.build()
//		.run(args);
		
		logger.info("Welcome to Spring Boot training :) - Spring Boot Simple example!");
	}	


}
