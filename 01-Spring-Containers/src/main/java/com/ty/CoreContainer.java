package com.ty;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CoreContainer {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("config.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
//		Student student = (Student) factory.getBean("myStudent");
//		student.play();
//		
//		Mobile mobile = (Mobile) factory.getBean("myMobile");
//		mobile.song();

	}

}
