package exercise02;

public class Vehicle {
	private String nameOfOwner;
	private String type;
	private int capacity;
	private float price;
	private float tax;

	public Vehicle() {
	}

	public Vehicle(String nameOfOwner, String type, int capacity, float price) {
		this.nameOfOwner = nameOfOwner;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
		this.tax = calculateTax();
	}

	public String getNameOfOwner() {
		return nameOfOwner;
	}

	public void setNameOfOwner(String nameOfOwner) {
		this.nameOfOwner = nameOfOwner;
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

	public void setPrice(float price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public float calculateTax() {
		if (capacity < 100) {
			return tax = price * 1 / 100;
		}
		if (capacity >= 100 && capacity < 200) {
			return tax = price * 3 / 100;
		} else {
			return tax = price * 5 / 100;
		}
	}

	@Override
	public String toString() {
		return String.format("%-20s%-15s%15d%20.2f%20.2f", nameOfOwner, type, capacity, price, tax);
	}
}
