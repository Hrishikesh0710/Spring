package com.listandmap;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext capp = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("===========List=============");
		Student stu = capp.getBean(Student.class);
		stu.display();
			
		System.out.println("===========Map=============");
		Shop sho = capp.getBean(Shop.class);
		sho.display();
	}
}
