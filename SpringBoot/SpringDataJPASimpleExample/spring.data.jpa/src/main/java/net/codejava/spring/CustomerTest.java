package net.codejava.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("net.codejava.spring");
		appContext.refresh();

		CustomerService customerService = (CustomerService) appContext.getBean("customerService");
		customerService.test();

		appContext.close();
	}

}
