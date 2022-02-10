package com.examples.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examples.spring.boot.config.ApplicationConfig;

// Uncomment @SpringBootApplication annotation to test CommandLineRunner example
//@SpringBootApplication
public class SpringBootExternalConfigEx implements CommandLineRunner 
{
	
	@Autowired
	Greetings greetings;
	
	@Autowired
	ApplicationConfig config;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExternalConfigEx.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// prints message property set in the application config file injected using @Value annotation
		System.out.println(greetings.getMessage() + " - Spring Boot External Configuration Injection Example!");
		
		// prints message property set in the application config file bind to Java bean using @ConfigurationProperties annotation
		System.out.println(config.getName() + " " + config.getMessage() + " - Spring Boot External Configuration Binding Example!");
	}

}
