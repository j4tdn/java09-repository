package beans;

public class Car {
	// attributes
	private String id;
	private String color;
	private String model;
	private Integer capacity; // sức chứa

	// number of people in car at the moment
	private int currentPassengers;

	// default constructure
	public Car() {

	}

	// constructor
	public Car(String pid, String pcolor, String pmodel, Integer pcapacity) {
		id = pid;
		color = pcolor;
		model = pmodel;
		if (pcapacity == null || pcapacity <= 0) {
			// bound , unbound, auto-bound
			throw new RuntimeException("Invalid capacity !");
		}
		capacity = pcapacity;

	}
//setter, getter
	public void setId(String id) {
		this.id = id;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

	public void setCapacity(Integer capacity) {
		if (capacity == null || capacity <= 0) {

			throw new RuntimeException("Invalid capacity !");
		}
		System.out.println("come here!");
		this.capacity = capacity;

	}
	

	public void setPassengers(int currentAmountOfPeople) {
		if (currentAmountOfPeople > this.capacity) {
			System.out.println("customer cannot exceed" + " " + capacity);
			return;
		}
		this.currentPassengers = currentAmountOfPeople;

	}

	public String getId() {
		return id;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public int getCurrentPassengers() {
		return currentPassengers;
	}

	@Override
	public String toString() {
		return id + " " + color + " " + model + " " + currentPassengers;

	}

	public boolean transfer(Car received, int qty) {
		int max = received.currentPassengers + qty;
		int min = currentPassengers - qty;

		if (max > received.capacity || min < 0) {
			return false;
		}
		received.currentPassengers += qty;
		currentPassengers -= qty;
		return true;

	}

	

}
