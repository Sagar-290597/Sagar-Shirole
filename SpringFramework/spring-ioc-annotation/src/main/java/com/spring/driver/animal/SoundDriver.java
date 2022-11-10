package com.spring.driver.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SoundDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfiguration.xml");
		AnimalSound animalSound =(AnimalSound) applicationContext.getBean("animalSound");
		animalSound.Sound();
		
	}
}