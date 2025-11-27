package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Using Constructor Injection
@Component(value = "myCollege")
public class College {
	private String name;
	private String address;
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}

	public College(@Value(value="RGIT") String name, @Value(value="Versova")String address) {
		this.name = name;
		this.address = address;
	}
	
	

}
