package com.spring.driver.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalSound {

	private Animal animal;
	
//	@Autowired
//	public AnimalSound(@Qualifier(value = "Dog")Animal animal) {
//		this.animal = animal;
//	}

	public void Sound() {
		animal.doSound();
	}

	@Autowired
	@Qualifier(value = "tiger")
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}