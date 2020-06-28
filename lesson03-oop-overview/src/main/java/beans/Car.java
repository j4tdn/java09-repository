package beans;

public class Car {
	// attributes
	private String id;
	private String color;
	private String model;
	// Number of people in car at the moment
	private int currentPassengers;
	private Integer capacity;

	// default constructor
	public Car() {
	}

	// constructor
	public Car(String id, String color, String model, Integer capacity) {
		this.id = id;
		this.color = color;
		this.model = model;
		if (this.capacity == null || this.capacity <= 0) {
			throw new RuntimeException("Invalid capacity!!!");
		}
		this.capacity = capacity;
	}

	// setter, getter
	public void setId(String id) {
		this.id = id;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getId() {
		return id;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public void setCapacity(Integer capacity) {
		if (this.capacity == null || this.capacity <= 0) {
			throw new RuntimeException("Invalid capacity!!!");
		}
		System.out.println("come here");
		this.capacity = capacity;
	}

	public void setCurrentPassengers(int currentAmountOfPeople) {
		if (currentAmountOfPeople > this.capacity) {
			System.out.println("customer cannot exceed " + capacity);
			return;
		}
		this.currentPassengers = currentAmountOfPeople;
	}

	public boolean transfer(Car received, int quantity) {
		int max = received.currentPassengers + quantity;
		int min = this.currentPassengers - quantity;
		received.currentPassengers += quantity;
		this.currentPassengers -= quantity;
		if (max > received.capacity || min < 0) {
			return false;
		}
		return true;

	}

	@Override
	public String toString() {
		return "id: " + id + ", color: " + color + ", model: " + model + ", current passengers: " + currentPassengers;
	}

}
