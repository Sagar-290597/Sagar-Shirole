package constructor_injector;

public class Train {

	private int id;
	private String train;
	private double price;
	
	public Train(int id, String train, double price)
	{
		super();
		this.id = id;
		this.train = train;
		this.price = price;
	}
	
	public void details()
	{
		System.out.println("Ticket Id:-" +id);
		System.out.println("Train Name:-" +train);
		System.out.println("Ticket Price:-" +price);
	}
}
