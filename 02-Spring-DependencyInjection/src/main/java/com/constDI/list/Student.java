package com.constDI.list;

import java.util.List;

public class Student {
	public String name ;
	public long phone;
	List<String>subjects;
	
	
	public Student(String name, long phone, List<String> subjects) {
		this.name = name;
		this.phone = phone;
		this.subjects = subjects;
	}
	
	public void display(){
		System.out.println("Student Details");
		System.out.println("========================");
		System.out.println("Name: "+name);
		System.out.println("Phone: "+phone);
		for (String string : subjects) {
			System.out.println(string);
		}
		
		
	}	
	
}
