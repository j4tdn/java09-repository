package exercises;

public class Vehicle {
	private String name;
	private String type;
	private double cylinder;
	private double price;
	private double tax;

	public Vehicle() {

	}

	public Vehicle(String name, String type, double cylinder, double price) {
		this.name = name;
		this.type = type;
		this.cylinder = cylinder;
		this.price = price;
		this.tax = this.caculateTax();
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCylinder() {
		return cylinder;
	}

	public void setCylinder(double cylinder) {
		this.cylinder = cylinder;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	private double caculateTax() {
		if (this.price < 100) {
			return this.price * 0.01;
		} else if (this.price <= 200) {
			return this.price * 0.03;
		} else {
			return this.price * 0.05;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%-20s%-20s%20.2f%20.2f%20.2f", this.name, this.type, this.price, this.cylinder, this.tax);
	}
}
