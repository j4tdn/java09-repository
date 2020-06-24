package beans;

import javax.management.RuntimeErrorException;

public class Car {

	// atributes
	private String id;
	private String color;
	private String model;
	// number of people in car
	private int currentPassengers;
	private Integer capacity;// sức chứa

	public void setCurrentPassengers(int currentPassengers) {
		if (currentPassengers > this.capacity) {
			System.out.println(" Customers cannot exceed" + capacity);
			return;
		}
		this.currentPassengers = currentPassengers;

	}

	// Default constructor
	public Car() {

	}

	// constructor
	public Car(String pid, String pcolor, String pmodel, Integer pcapacity) {
		id = pid;
		color = pcolor;
		model = pmodel;
		if (pcapacity == null || pcapacity <= 0) {
			throw new RuntimeException(" Invalid capacity !");
		}
		System.out.println("Come here !");
		capacity = pcapacity;
	}

	public void setCapacity(Integer capacity) {
		if (capacity == null || capacity <= 0) {
			throw new RuntimeException(" Invalid capacity !");
		}
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return id + " ; " + color + " ; " + model + " ; " + currentPassengers;
	}

	public boolean transfer(Car received, int qty) {
		int max = received.currentPassengers + qty;
		int min = currentPassengers - qty;
		if (max > received.capacity || min < 0) {
			return false;
		}
		received.currentPassengers += qty;
		this.currentPassengers -= qty;
		return true;

	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.id = "1108";
		c1.color = "blue";
		c1.model = "audi";

		c1.setCapacity(1);
		c1.setCurrentPassengers(2);

		Car c2 = new Car("2004", "black", "huynhdai", 8);
		c2.setCurrentPassengers(5);

		c1.transfer(c2, 1);

		System.out.println(c1);
		System.out.println(c2);

	}
}
