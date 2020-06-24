package beans;

public class Car {
	private String id;
	private String color;
	private String model;
	private int capacity; // suc chua

	// number of people in car at the moment
	private int currentAmountOfPeople;

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

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.id = "123abc";
		c1.color = "red";
		c1.model = "ducati";
		c1.setCapacity(8);
		c1.setcurrentPassengers(6);

		Car c2 = new Car("456xyz", "blue", "lambogini", 8);
		c2.currentAmountOfPeople = 3;

		c1.transfer(c2, 1);

		System.out.println(c1);
		System.out.println(c2);

	}
}
