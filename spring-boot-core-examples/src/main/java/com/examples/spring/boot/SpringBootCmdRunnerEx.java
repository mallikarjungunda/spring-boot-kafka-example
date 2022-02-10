package com.examples.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// Uncomment @SpringBootApplication annotation to test CommandLineRunner example
//@SpringBootApplication
public class SpringBootCmdRunnerEx implements CommandLineRunner 
{
	
	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	Greetings greetings;

	public static void main(String[] args) {
		
		if(args.length == 3) {
			System.out.println("Argument 1: " + args[0]);
			System.out.println("Argument 2: " + args[1]);
			System.out.println("Argument 3: " + args[2]);
		} else {
			System.out.println("Invalid no of arguments");
			System.exit(0);
		}
		
		System.out.println("Spring Boot App Launching...");
		SpringApplication.run(SpringBootCmdRunnerEx.class, args);
		System.out.println("Spring Boot App Launched...");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(ctx.getBeanDefinitionCount());
		for(String bean: ctx.getBeanDefinitionNames()) {
			System.out.println(bean);
		}
		
		System.out.println("Argument #1: " + args[0]);
		System.out.println("Argument #2: " + args[1]);
		System.out.println("Argument #3: " + args[2]);
		
		System.out.println(greetings.getMessage() + " - " + "Spring Boot Command Runner Example!");
		System.out.println("Inside run method...");
	}

}
