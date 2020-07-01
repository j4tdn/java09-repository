package beans;

public class Vehicle {
	private String carOwner;
	private String model;
	private String color;
	private Integer capacity;
	private Double price;
	private double tax;

	public Vehicle() {
	}

	public Vehicle(String carOwner, String model, String color, Integer capacity, Double price) {
		super();
		if (carOwner == null) {
			throw new RuntimeException("Invalid carOwner");
		}
		this.carOwner = carOwner;
		this.model = model;
		this.color = color;
		if (capacity == null || capacity <= 0) {
			throw new RuntimeException("Invalid capacity");
		}
		this.capacity = capacity;
		if (price == null || price <= 0) {
			throw new RuntimeException("Invalid price");
		}
		this.price = price;
		if (this.capacity < 100) {
			this.tax = this.price * 0.01;
		} else if (this.capacity < 200) {
			this.tax = this.price * 0.03;
		} else {
			this.tax = this.price * 0.05;
		}
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		if (carOwner == null) {
			throw new RuntimeException("Invalid carOwner");
		}
		this.carOwner = carOwner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		if (capacity == null || capacity <= 0) {
			throw new RuntimeException("Invalid capacity");
		}
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		if (price == null || price <= 0) {
			throw new RuntimeException("Invalid price");
		}
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax() {
		if (this.capacity < 100) {
			this.tax = this.price * 0.01;
		} else if (this.price < 200) {
			this.tax = this.price * 0.03;
		} else {
			this.tax = this.price * 0.05;
		}
	}

}
