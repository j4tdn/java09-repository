package beans;

import javax.management.RuntimeErrorException;

public class Car {
	
	// attributes
	private String id;
	private String color;
	private String model;
	private Integer capacity;
	
	// Number of people im car at the moment
	private int currentPassengers;
	
	// default constructor
		public Car() {
			
		}
		// constructor
		public Car(String pid, String pcolor, String pmodel, Integer pcapacity) {
			id = pid;
			color = pcolor;
			model = pmodel;
			if(pcapacity == null || pcapacity <= 0) {
				throw new RuntimeException("Invalid capacity !");
			}
			capacity = pcapacity;
			
		}
	public void setCapacity(Integer capacity) {
		if(capacity == null || capacity <= 0) {
			throw new RuntimeException("Invalid capacity !");
		}
		System.out.println("come here !");
		this.capacity = capacity;
	}
	public void setCurrentPassengers(int setCurrentPassengers) {
		if(setCurrentPassengers > this.capacity) {
			System.out.println("Customer cannot exceed " + capacity);
			return;
		}
		this.currentPassengers = setCurrentPassengers;
	}
	
	
	
	@Override
	public String toString() {
		return id + ", " + color + ", " + model + capacity;
	}
	
	public boolean transfer(Car received, int qty) {
		int max = received.currentPassengers + qty;
		int min = currentPassengers - qty;
		
		if(max > received.capacity || min < 0) {
			return false;
		}
		received.currentPassengers += qty;
		currentPassengers -= qty;
		return true;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.id = "123abc";
		c1.color = "green";
		c1.model = "benz";
		c1.currentPassengers = 6;
		c1.setCapacity(1);
		c1.setCurrentPassengers(6);
		
		Car c2 = new Car("456xyz", "yellow", "lambo", 8);
		c2.currentPassengers = 3;
		
		c1.transfer(c2, 100);
		
		System.out.println(c1);
		System.out.println(c2);
	}
}
