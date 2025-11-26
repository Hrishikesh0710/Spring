package com.constDI.list;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config-CDI.xml");
		Student student = (Student) app.getBean("myStudent");
		student.display();

	}

}
