package com.spring.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	int id;
	String name;
	char gender;
	int age;
	
	private Bike bike;

	public Bike getBike() {
		return bike;
	}

	@Autowired
	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Student(@Value(value="101")int id,@Value(value="ll") String name,@Value(value="M") char gender,@Value(value="69") int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void Details() {
		System.out.println("Student Id:" +id);
		System.out.println("Student Name: " +name);
		System.out.println("Student Geander: " +gender);
		System.out.println("Student age: " +age);
		
	}
}
