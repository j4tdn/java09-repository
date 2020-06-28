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
	
	//setter, getter
	public void setID(String id) {
		this.id=id;
	}
		
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
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

