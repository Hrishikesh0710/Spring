package com.constDI;

public class Person {
		public String name; 
		public int age;
		
		public void display() {
			System.out.println("Person Details");
			System.out.println("========================q");
			System.out.println("Name: "+name);
			System.out.println("age: "+age);
			
		}
		Person(String name , int age){
			this.name = name;
			this.age=age;
		}
		
}
