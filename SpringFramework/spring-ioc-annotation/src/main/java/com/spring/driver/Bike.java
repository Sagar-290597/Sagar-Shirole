package com.spring.driver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	@Value(value="10")
	int id;
	@Value(value="220")
	int cc;
	@Value(value="Thunderbird")
	String name;
	@Value(value="Black")
	String color;
	
	public void Details() {
		System.out.println("Bike Registration Id: " +id);
		System.out.println("Bike CC: " +cc);
		System.out.println("Bike Name: " +name);
		System.out.println("Bike Colour: " +color);
	}
	
	
}
