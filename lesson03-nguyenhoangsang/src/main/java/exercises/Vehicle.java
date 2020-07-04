package exercises;

public class Vehicle {
	private String owner;
	private String model;
	private int capacity;
	private float price;
	private float tax;
	
	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String owner, String model, int capacity, int price) {
		super();
		this.owner = owner;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
