package com.examples.spring.boot.core.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.examples.spring.boot.core.profile.service.DbConnectionConfig;
import com.examples.spring.boot.core.profile.service.HealthCheckService;

@SpringBootApplication
public class ProfileApplicationMain implements CommandLineRunner {

	@Autowired
	ApplicationContext ctx;	
	
	@Autowired
	DbConnectionConfig dbConfig;

    @Override
    public void run(String... args) throws Exception {
    	
    	System.out.println(dbConfig.getDbname() + " " + dbConfig.getHost() + " " + dbConfig.getPort());
    	
    	// print health status if it is prod environment
    	if(ctx.getEnvironment().acceptsProfiles("prod"))
    	{
    		HealthCheckService healthService = (HealthCheckService) ctx.getBean("healthCheckService");
    		System.out.println("Health Status: " + healthService.getStatus());
    	}
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProfileApplicationMain.class, args);
    }

}
