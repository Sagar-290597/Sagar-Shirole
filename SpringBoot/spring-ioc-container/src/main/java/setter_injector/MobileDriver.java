package setter_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mobile.xml");
		Mobile mobile = context.getBean(Mobile.class, "mobile3");

		mobile.details();
	}
}