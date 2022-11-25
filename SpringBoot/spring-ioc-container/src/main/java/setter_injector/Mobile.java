package setter_injector;

public class Mobile {
	private int id;
	private String brand;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void details() {
		System.out.println("Mobile Id: " + id);
		System.out.println("Mobile Brand: " + brand);
		System.out.println("Mobile Price: " + price);
	}
}
