package com.examples.scart.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ShoppingCartApiGateway {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApiGateway.class, args);
	}

}
