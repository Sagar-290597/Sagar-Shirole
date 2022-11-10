package driver;

public class Pencil {
	private int id;
	private double price;
	private String brand;

	public void setId(int id) {
		this.id = id;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Pencil(int id, double price, String brand) {

		this.id = id;
		this.price = price;
		this.brand = brand;
	}

	public void Details() {
		System.out.println("Pencil Id: " + id);
		System.out.println("Pencil Price: " + price);
		System.out.println("Pencil Brand: " + brand);
	}
}
