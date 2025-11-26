package com.constDI.Obj;

public class Car {
	private String name;
	private double price;
	private Engine engine;
	
	
	public Car(String name, double price, Engine engine) {
		this.name = name;
		this.price = price;
		this.engine = engine;
	}
	
	public void display() {
		System.out.println("Car Details");
		System.out.println("===============");
		System.out.println("Name:"+name);
		System.out.println("Price:"+price);
		System.out.println("Cc:"+engine.cc);
		engine.start();
	}
	
	

}
