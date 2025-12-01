package com.movie;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext capp = new AnnotationConfigApplicationContext(AppConfig.class);
		Theatre t = (Theatre) capp.getBean(Theatre.class);
		t.playMovie();
	}
}
