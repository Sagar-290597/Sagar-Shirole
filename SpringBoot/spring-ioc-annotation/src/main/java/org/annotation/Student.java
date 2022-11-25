package org.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	int id;
	String name;
	String gender;
	int age;

	public Student(@Value(value = "1") int id, @Value(value = "XYZ") String name, @Value(value = "Male") String gender,
			@Value(value = "24") int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public void details() {
		System.out.println("Student Id: " +id);
		System.out.println("Student Name: " +name);
		System.out.println("Student Gender: " +gender);
		System.out.println("Student Age: " +age);
	}

}
