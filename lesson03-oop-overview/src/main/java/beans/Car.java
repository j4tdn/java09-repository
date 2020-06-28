package beans;

public class Car {
	// attributes :
	private String id;
	private String color;
	private String model;
	private Integer capacity;
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
			// bound, unbound, auto-bound
			// capacity = pcapacity;
			throw new RuntimeException("Invalid capacity!");
		}
		capacity = pcapacity;

	}

	public void setCurrentPassenger(int currentPassenger) {
		if (currentPassenger > this.capacity) {
			System.out.println("customers cannot exceed " + this.capacity);
			return;
		}
		System.out.println("come here");
		this.currentPassenger = currentPassenger;
	}

	public void setCapacity(Integer capacity) {
		if (capacity == null || capacity <= 0) {

			throw new RuntimeException("Invalid capacity!");
		}
		this.capacity = capacity;

	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id + "," + color + "," + model + "," + currentPassenger;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	//getter
	
	

	public boolean transfer(Car received, int qty) {
		int max = received.currentPassenger + qty;
		int min = currentPassenger - qty;
		if (max > received.capacity || min < 0) {
			return false;
		}
		received.currentPassenger += qty;
		currentPassenger -= qty;
		return true;
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

	public int getCurrentPassenger() {
		return currentPassenger;
	}
	

}
