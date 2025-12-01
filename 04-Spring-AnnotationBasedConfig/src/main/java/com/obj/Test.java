package com.obj;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext capp = new AnnotationConfigApplicationContext(AppConfig.class);
		Person person = capp.getBean(Person.class);
		person.display();
		
		Mobile mobile = capp.getBean(Mobile.class);
		mobile.display();
	}
}
