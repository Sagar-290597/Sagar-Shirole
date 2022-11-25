package org.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	@Value(value = "100")
	int id;
	@Value(value = "110")
	int cc;
	@Value(value = "Thunderbird")
	String name;
	@Value(value = "Black")
	String color;

	public void details() {
		System.out.println("Bike Id: " +id);
		System.out.println("Bike CC: " +cc);
		System.out.println("Bike Name: " +name);
		System.out.println("Bike Color: " +color);
	}
}