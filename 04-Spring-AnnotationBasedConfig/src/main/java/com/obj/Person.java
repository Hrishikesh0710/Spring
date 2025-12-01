package com.obj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
		@Value(value = "Hrishi")
		private String name;
		
		@Autowired
		private Mobile mobile;
		
		public void display() {
			System.out.println(name + " got a call!!, ");
			mobile.ring();
		}
}
