package beans;

import javax.management.RuntimeErrorException;

public class Car {
	// attributes
	private String id;
	private String color;
	private String model;
	private Integer capacity;// sức chưa bao nhiêu người
	// number of people in car at the moment
	private int currentPassenger;

	// default constructor
	public Car() {
	}

	// constructor
	public Car(String pid, String pcolor, String pmodel, Integer pcapacity) {
		id = pid;
		color = pcolor;
		model = pmodel;
		if (pcapacity == null || pcapacity <= 0) {
			throw new RuntimeException(" Valid capacity !");
			// bound ,unbound ,auto-bound
		}
		capacity = pcapacity;

	}

	public void setCapacity(Integer capacity) {
		if (capacity == null || capacity <= 0) {
			throw new RuntimeException(" Valid capacity !");
			// bound ,unbound ,auto-bound
		}
		this.capacity = capacity;
	}

	public void setCurentPassenger(int currentPassenger) {
		if (currentPassenger < this.capacity) {
			System.out.println("Customer cannot exceed " + this.capacity);
			return;
		}
		this.currentPassenger = currentPassenger;
	}

	@Override
	public String toString() {
		return id + "," + color + "," + model + "," + currentPassenger;
	}

	public boolean transfer(Car received, int qty) {
		int max = received.currentPassenger + qty;
		int min = currentPassenger - qty;
		if (max > received.capacity || min < 0)
			return false;
		received.currentPassenger = currentPassenger + qty;
		currentPassenger = currentPassenger - qty;
		return true;

	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.id = "123abc";
		c1.color = "green";
		c1.model = "benz";
		c1.setCapacity (1);
		c1.setCurentPassenger(6);
		Car c2 = new Car("456xyz", "yellow", "lambo", 8);
		c2.currentPassenger = 3;
		c1.transfer(c2, 1);
		System.out.println(c1);
		System.out.println(c2);
	}
}
