package beans;

public class Car {
	private String id;
	private String color;
	private String model;
	private int currentAmountOfPeople;
	private int capacity;

	public Car() {
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCurrentAmountOfPeople() {
		return currentAmountOfPeople;
	}

	public String getId() {
		return id;
	}

	public int getCapacity() {
		return capacity;
	}

	public Car(String id, String color, String model, int capacity) throws RuntimeException {
		this.id = id;
		this.color = color;
		this.model = model;
		if(capacity <= 0) {
			throw new RuntimeException("Hi");
		}
		this.capacity = capacity;
	}
	
	public void setCapacity(int capacity) {
		if(capacity <= 0) {
			throw new RuntimeException();
		}
		this.capacity = capacity;
	}
	
	public void setCurrentPassenger(int currentPassenger) {
		if(currentPassenger <= this.capacity) {
			this.currentAmountOfPeople = currentPassenger;
		} else {
			System.out.println("Error over capacity");
		}
	}

	@Override
	public String toString() {
		return id + ", " + color + ", " + model + ", " + currentAmountOfPeople;
	}
	
	public boolean transfer(Car receivedCar, int qty) {
		int max = receivedCar.currentAmountOfPeople + qty;
		int min = currentAmountOfPeople - qty;
		
		if(max > receivedCar.capacity || min < 0) {
			return false;
		} else {
			receivedCar.currentAmountOfPeople = max;
			currentAmountOfPeople = min;
			return true;
		}
	}
}
