package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bean")
public class AppConfig {
	
	@Bean
	public Address getAddress() {
		return new Address();
	}

}
