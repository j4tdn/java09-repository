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

	public int getCurrentPassenger() {
		return currentPassenger;
	}

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
   //setter, getter
	public void setId(String id )
	{
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


}
