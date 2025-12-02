package com.listandmap;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.listandmap")
public class AppConfig {
	
	@Bean
	public List<String> getSubjects() {
		return Arrays.asList("Java","Sql","Python");
	}
	
	@Bean
	public Map<String, Double> getItems(){
		 Map<String, Double> items = new LinkedHashMap<String, Double>();
		    items.put("Iphone", 10000.100);
		    items.put("TV", 5500.80);
		    items.put("PS5", 65000.450);
		    return items;
	}

}
