package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Using Field or Var Injection
public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		Student student =(Student)app.getBean("myStudent");
		student.display();
		
		System.out.println("===================");
		
		Person per = (Person)app.getBean("myPerson");
		per.display();
		
		System.out.println("===================");
		
		College col = (College)app.getBean("myCollege");
		col.display();
		
		

	}

}
