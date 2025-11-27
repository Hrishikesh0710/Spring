package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myStudent")
public class Student {
	@Value("Hrishi")
	private String name;
	@Value("hrishipan2003@gmail.com")
	private String email;
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
	}
	
	
}
