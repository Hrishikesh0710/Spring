package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Using Setter Injection

@Component(value ="myPerson")
public class Person {
	private String name;
	private int age;
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	@Value("Hrishi")
	public void setName(String name) {
		this.name = name;
	}
	@Value("23")
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
