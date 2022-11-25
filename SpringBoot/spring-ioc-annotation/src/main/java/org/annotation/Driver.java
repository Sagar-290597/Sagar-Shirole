package org.annotation;

import org.annotation.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfiguration.xml");
		Bike bike = (Bike)context.getBean("bike");
		bike.details();
		
		Student student = (Student)context.getBean("student");

		student.details();
	}
}
