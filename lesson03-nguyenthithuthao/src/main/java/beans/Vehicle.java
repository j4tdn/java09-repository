package beans;

public class Vehicle {
	private String name;
	private String type;
	private int capacity;
	private double price;
	private double tax;

	// default constructor
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name, String type, int capacity, double price) {
		super();
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		if (capacity < 100) {
			return tax = price * 0.01;
		} else if (capacity >= 100 & capacity < 200) {
			return tax = price * 0.03;
		} else {
			return tax = price * 0.05;
		}

	}

	public void setTax(long tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return name + "          " + type + "          " + capacity + "          " + price
				+ "          ";
	}

}
