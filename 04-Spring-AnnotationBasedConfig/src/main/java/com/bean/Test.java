package com.bean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext capp = new AnnotationConfigApplicationContext(AppConfig.class);
		Person per = capp.getBean(Person.class);
		per.display();
	}
}
