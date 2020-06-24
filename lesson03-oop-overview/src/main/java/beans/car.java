package beans;

public class car {

	// attribute
	private String id;
	private String color;
	private String model;

	private int currentPassengers;
	private Integer capacity;
	
	
	// default constructor
	public car() {

	}
	

	// constructor
	public car(String pid, String pcolor, String pmodel, Integer pcapacity) {
		id = pid;
		color = pcolor;
		model = pmodel;
		if (pcapacity == null || pcapacity <= 0) {
			throw new RuntimeException("Invalid capacity !");
		}
		capacity = pcapacity;
	}
	
	public void setCapacity(Integer capacity) {
		if (capacity == null || capacity <= 0) {
			throw new RuntimeException("Invalid capacity !");
		}
		System.out.println("Come here !");
		this.capacity = capacity;
	}

	public void setCurrentPassengers(int currentPassengers) {
		if (currentPassengers > this.capacity) {
			System.out.println("Customers cannot exceed " + capacity);
			return;
		}
		this.currentPassengers = currentPassengers;
	}



	@Override
	public String toString() {
		return id + ", " + color + ", " + model + ", " + currentPassengers;
	}

	public boolean transfer(car received, int qty) {
		int max = received.currentPassengers + qty;
		int min = currentPassengers - qty;
		if (max > received.capacity || min < 0) {
			return false;
		}
		received.currentPassengers = received.currentPassengers + qty;
		currentPassengers = currentPassengers - qty;
		return true;
	}

	public static void main(String[] args) {
		car c1 = new car();
		c1.id = "123abc";
		c1.color = "green";
		c1.model = "benz";

		c1.setCapacity(8);
		c1.setCurrentPassengers(6);

		car c2 = new car("456xyz", "orange", "lambo", 8);
		c2.setCurrentPassengers(3);

		c1.transfer(c2, 1);

		System.out.println("id : " + c1);// mac dinh khi in ra c1, han se in ra c1.toString() cua class object
		// nhung ma bay h minh da tao ham toString cua lop car nen han se goi ra ham
		// string cua lop car
		System.out.println("id : " + c2);
	}
}
