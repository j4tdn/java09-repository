package beans;

public class Car {
	private String id;
	private String color;
	private String model;
	private int capacity; // suc chua

	// number of people in car at the moment
	public int currentAmountOfPeople;

	// default constructor
	public Car() {

	}

	// constructor
	public Car(String pid, String pcolor, String pmodel, Integer pcapacity) {
		id = pid;
		color = pcolor;
		model = pmodel;
		if (pcapacity == null || pcapacity <= 0) {
			throw new RuntimeException("invalid capacticy ");
		}
		capacity = pcapacity;
	}
	
	//setter, getter
	public void setId(String id) {
		this.id=id;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setCapacity(Integer capacity) {
		if (capacity == null || capacity <= 0) {
			throw new RuntimeException("invalid capacticy ");
		}
		System.out.println("come here! ");
		this.capacity = capacity;
	}

	public void setcurrentPassengers(int currentAmountOfPeople) {
		if (currentAmountOfPeople > this.capacity) {
			System.out.println("customers cannot exced  " + capacity);
			return;
		}
		this.currentAmountOfPeople = currentAmountOfPeople;
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

	public int getCapacity() {
		return capacity;
	}

	public int getCurrentAmountOfPeople() {
		return currentAmountOfPeople;
	}

	@Override
	public String toString() {
		return id + "," + color + "," + model + "," + currentAmountOfPeople;
	}

	public boolean transfer(Car received, int qty) {
		int max = received.currentAmountOfPeople + qty;
		int min = currentAmountOfPeople - qty;
		if (max > received.capacity || min < 0) {
			return false;
		}

		received.currentAmountOfPeople += qty;
		currentAmountOfPeople -= qty;
		return true;
	}

	
}
