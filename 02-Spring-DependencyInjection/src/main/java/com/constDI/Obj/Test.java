package com.constDI.Obj;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config-CDI.xml");
		Car car = (Car)app.getBean("myCar");
		car.display();

	}

}
