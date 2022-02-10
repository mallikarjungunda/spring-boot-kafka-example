package com.examples.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("beans-config.xml")
public class SpringBootXmlConfigEx implements ApplicationRunner 
{
	
	@Autowired
	Greetings greetings;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootXmlConfigEx.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(greetings.getMessage() + " - " + "Spring Boot with XML Config Example!");		
	}

}
