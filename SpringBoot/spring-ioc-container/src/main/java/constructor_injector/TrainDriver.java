package constructor_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrainDriver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("train.xml");
		Train train = context.getBean(Train.class, "train2");
		train.details();

	}

}
