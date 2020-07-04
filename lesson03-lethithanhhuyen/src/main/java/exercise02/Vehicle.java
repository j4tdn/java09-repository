package exercise02;

public class Vehicle {
	private String name;
	private String model;
	private long capacity;
	private double price;
	
	public Vehicle () {
		
	}

	public Vehicle(String name, String model, long capacity, double price) {
		super();
		this.name = name;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getCapacity() {
		return capacity;
	}

	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double tax () {
		if (capacity < 100 ) {
			return price * 0.01;
		} else if (capacity <= 200) {
			return price *0.03;
		} else return price *0.05;
	}
	
}
