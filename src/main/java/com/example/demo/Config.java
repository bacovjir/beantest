package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public FirstService myService() {
		System.out.println("First service is created");
		return new FirstService(myRepo());
	}

	@Bean
	public SecondService secodService() {
		System.out.println("Second service is created");
		return new SecondService(myRepo());
	}

	@Bean
	public MyRepository myRepo() {
		System.out.println("I was called only once");
		return new MyRepository();
	}
}
