package beans;

import javax.management.RuntimeErrorException;

public class Car {
	// atributes:thuoctinh
	private String id;
	private String color;
	private String model;
	
	private Integer capacity;
		
	private int currentPassengers;

	public Car() {

	}

	// constructor:hamkhoitao
	public Car(String pid, String pcolor, String pmodel, Integer pcapacity) {
		id = pid;
		color = pcolor;
		model = pmodel;
		if ( pcapacity ==null || pcapacity <= 0) {
			throw new RuntimeException("invald capacity !");
			//bound,unbound,auto-bound
			
	}
		capacity=pcapacity;
	}
	public void setCapasity(Integer capacity) {
		if ( capacity ==null || capacity <= 0) {
			throw new RuntimeException("invald capacity !");
			//bound,unbound,auto-bound
			
	}
		this.capacity=capacity;
	}
	public void setCurrentPassengers(int currentPassengers) {
		if (currentPassengers > this.capacity) {
			System.out.println("customer cannot exceed " + capacity);
			return;
		}
		this.currentPassengers = currentPassengers;
	}

	// number of people in car at the moment
	// default constructor
	

	@Override
	public String toString() {
		return id + ", " + color + ", " + model + "," + currentPassengers;

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

	public static void main(String[] args) {
		Integer a = new Integer(5);
		Car c1 = new Car();
		c1.id = "123abc";
		c1.color = "green";
		c1.model = "benz";
		c1.setCapasity(6);
		c1.setCurrentPassengers(2);

		System.out.println(c1);

		Car c2 = new Car("456xyz", "yellow", "lambo", 4);
		c2.setCurrentPassengers(2);
		System.out.println(c2);

		c1.transfer(c2, 2);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
