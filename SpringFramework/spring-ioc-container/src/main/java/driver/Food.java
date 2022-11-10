package driver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Food {
	@Value(value="Pav Bhaji")
	String fname;
	@Value(value="70")
	double price;
	
	public void Details() {
		System.out.println(fname);
		System.out.println(price);
		System.out.println("It Is Famouus in Mumbai");
	
	}
	
}