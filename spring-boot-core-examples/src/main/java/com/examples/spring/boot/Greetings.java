package com.examples.spring.boot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.examples.spring.boot.config.ApplicationConfig;

@Component
public class Greetings {
	
	@Value("${message}")
//	@Value("Welcome to Spring Boot training :)")
	private String message;
	
	// default constructor
	public Greetings()
	{
		
	}
	
	// creates Greetings object with message property
	public Greetings(String message)
	{
		this.message = message;
	}
	
	// creates Greetings object with message property
	public Greetings(String message1, String message2)
	{
		this.message = message1 + " " + message2;
	}	

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {

		return message;
	}
	
/*	@PostConstruct
	public void init()
	{
		System.out.println("Bean getting initialized..");
	}*/
	
/*	@PreDestroy
	public void cleanup()
	{
		System.out.println("Bean getting destroyed");
	}*/
}