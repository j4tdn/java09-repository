package beans;

public class Car {
	private String id;
	private String color;
	private String model;
	private int currentAmountOfPeople;
	private int capacity;

	public Car() {
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

	public static void main(String[] args) {
		Car c1 = new Car("nxcd12", "green", "mercedes", 0);
		Car c2 = new Car("123jgf", "red", "lamboghini", 20);
		
		c1.currentAmountOfPeople = 4;
		c2.currentAmountOfPeople = 7;
		
		c1.transfer(c2, 1);

		System.out.println("id: " + c1);
		System.out.println("id: " + c2);
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
