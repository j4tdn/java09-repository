package beans;

public class Car {
	private String id;
	private String color;
	private String model;

	// number off people in car at the moment
	private int Passengers;
	private Integer capacity;// suc chua

	public Car() {

	}

	// constructor
	public Car(String pid, String pcolor, String pmodel, Integer pcapacity) {
		id = pid;
		color = pcolor;
		model = pmodel;
		if (pcapacity == null || pcapacity <= 0) {
			throw new RuntimeException("invalid capacticy");
		}
		capacity = pcapacity;
	}
	/////getter, setter
	public void setId(String iD) {
		this.id=iD;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void setPassengers(int passengers) {
		this.Passengers = passengers;
	}

////////getter	
	

	public int getPassengers() {
		return Passengers;
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

	public void setCapacity(Integer capacity) {
		if (capacity == null || capacity <= 0) {
			throw new RuntimeException("invalid capacticy");
		}
		System.out.println("====");
		this.capacity = capacity;
	}
	public void setCurrentPassengers(int currenyAmountOfPeople) {
		if (currenyAmountOfPeople > this.capacity) {
			System.out.println("customers cannot exceed" + capacity);
			return;
		}
		this.Passengers = currenyAmountOfPeople;
	}

	@Override
	public String toString() {

		return (id + "   " + color + "   " + model + "   " + Passengers);
	}

	public boolean transfer(Car received, int qty) {
		int max = received.Passengers + qty;
		int min = Passengers - qty;
		if (max > received.capacity || min < 0) {
			return false;
		}

		received.Passengers += qty;
		Passengers -= qty;
		return true;
	}

	public static void main(String[] args) {
	
	}
}
