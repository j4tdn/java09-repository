package exercises;

public class Vehicle {
	private String ownerName;
	private String type;
	private int cylinder;
	private double price;
	private double tax;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name, String type, int cylinder, double price) {
		super();
		this.ownerName = name;
		this.type = type;
		this.cylinder = cylinder;
		this.price = price;
		this.tax = calculateTax();
	}

	public String getName() {
		return ownerName;
	}

	public void setName(String name) {
		this.ownerName = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCylinder() {
		return cylinder;
	}

	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double calculateTax() {
		if (cylinder < 100) {
			tax = price * 0.01;
		} else if (cylinder < 200) {
			tax = price * 0.03;
		} else {
			tax = price * 0.05;
		}
		return tax;
	}

	@Override
	public String toString() {
		return String.format("%s%25s%20d%23f%20f\n", this.ownerName, this.type, this.cylinder, this.price, this.tax);
	}
}
