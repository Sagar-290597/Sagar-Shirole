package com.spring.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfiguration.xml");
		Bike bike = (Bike) applicationContext.getBean("bike");
		bike.Details();
		
		Student student = (Student) applicationContext.getBean("student");
		student.Details();
	}
}