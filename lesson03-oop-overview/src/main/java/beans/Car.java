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

	@Override
	public String toString() {
		return id + "," + color + "," + model + "," + currentPassenger;
	}

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

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.id = "123";
		c1.color = "green";
		c1.model = "benz";
		// catch error for capacity
		c1.setCapacity(1);
		c1.setCurrentPassenger(6);

		Car c2 = new Car("456", "orange", "lambo", 8);
		c2.currentPassenger = 3;

		c1.transfer(c2, 100);

		System.out.println(c1);
		System.out.println(c2);

	}

}
