package com.obj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	@Value(value = "Iphone")
	private String brand ;
	
	@Value(value = "2000000")
	private double price;
	
	public void display() {
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
	}

	public void ring() {
		System.out.println("Mobile ringing!!!!!!!!!!!");
	}
	
}
