package setter.injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import driver.Pencil;

public class PencilDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("pencil.xml");
		Pencil pencil = (Pencil) applicationContext.getBean("mypencil1");
		pencil.Details();
	}
}