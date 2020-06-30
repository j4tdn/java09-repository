package entities;

import java.time.format.TextStyle;

public class Vehicle {
	private String ownerName;
	private String type;
	private double price;
	private double cylinderCapacity;
	private double tax;
	
	public Vehicle() {
	}

	
	public Vehicle(String ownerName, String type, double price, double cylinderCapacity) {
		this.ownerName = ownerName;
		this.type = type;
		this.price = price;
		this.cylinderCapacity = cylinderCapacity;
		this.tax = calculateTax();
	}

	private double calculateTax() {
		if(cylinderCapacity < 100) {
			return price * 0.01;
		} else if (cylinderCapacity < 200) {
			return price * 0.03;
		} else {
			return price * 0.05;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(double cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}
	
	public double getTax() {
		return this.tax;
	}
	
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return String.format("%-20s%-15s%15.2f%20.2f%20.2f", this.ownerName, this.type, this.cylinderCapacity, this.price, this.tax);
	}
}
