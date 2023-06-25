package com.example.springbootcondition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootConditionApplication {

	public static void main(String[] args) {
		// Start Springboot Application, return ioc container
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootConditionApplication.class, args);

		// Get Bean, redisTemplate
//		Object redisTemplate = context.getBean("redisTemplate");
//		System.out.println(redisTemplate);


		Object user = context.getBean("user2");
		System.out.println(user);
	}

}
