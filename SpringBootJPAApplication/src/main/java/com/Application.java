package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
 

@SpringBootApplication 
public class Application {

	@Autowired
	private static ConfigurableEnvironment env;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	//env.setActiveProfiles("prod");
		  
	}

}