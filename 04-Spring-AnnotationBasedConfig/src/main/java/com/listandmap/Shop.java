package com.listandmap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Shop {
	
	@Value(value="Electronics")
	private String name;
	
	
	@Autowired
	private Map<String, Double> items;
	
	public void display() {
		System.out.println("Welcome to shope " + name);
		System.out.println("=========Items=======");
		for (Map.Entry<String, Double> item : items.entrySet()) {
			System.out.println(item.getKey() + " ==> " + item.getValue());
		}
	}

}
