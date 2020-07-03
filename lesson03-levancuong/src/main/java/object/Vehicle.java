package object;

public class Vehicle {
	private String nameOwnerCar;
	private String kindOfCar;
	private int capacity;
	private double value;
	private double taxes;

	public Vehicle() {
	}

	public Vehicle(String nameOwnerCar, String kindOfCar, int capacity, double value) {
		this.nameOwnerCar = nameOwnerCar;
		this.kindOfCar = kindOfCar;
		this.capacity = capacity;
		this.value = value;
		this.taxes = calculateTaxes();
	}

	public String getNameOwnerCar() {
		return nameOwnerCar;
	}

	public void setNameOwnerCar(String nameOwnerCar) {
		this.nameOwnerCar = nameOwnerCar;
	}

	public String getKindOfCar() {
		return kindOfCar;
	}

	public void setKindOfCar(String kindOfCar) {
		this.kindOfCar = kindOfCar;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	public double calculateTaxes() {
		double result = 0;
		if (this.capacity < 100) {
			result = this.value * 0.01;
		} else {
			if (this.capacity > 200) {
				result = this.value * 0.05;
			} else {
				result = this.value * 0.03;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return String.format("%-20s%-15s%-15d%-18.3f%-18.3f", this.nameOwnerCar, this.kindOfCar, this.capacity,
				this.value, this.taxes);
	}

}
