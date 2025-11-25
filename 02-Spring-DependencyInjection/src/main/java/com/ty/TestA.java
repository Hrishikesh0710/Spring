package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new  ClassPathXmlApplicationContext("config.xml");
		Car car = (Car) app.getBean("car");
		car.display();
	}

}
