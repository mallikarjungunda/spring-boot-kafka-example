package com.examples.spring.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.examples.spring.boot.Greetings;

//@Configuration
public class GreetingsConfig 
{
	@Bean
	public Greetings greetings() {
		return new Greetings();
	}
}
