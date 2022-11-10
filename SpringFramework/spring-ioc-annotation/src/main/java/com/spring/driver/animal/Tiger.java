package com.spring.driver.animal;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal{

	public void doSound() {
		System.out.println("Roar.....");
		
	}

}