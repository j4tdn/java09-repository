package beans;

public class Car {

	// attributes
	private String id;
	private String color;
	private String model;

	// number of people in car at the moment
	private int currentPassenger;
	private Integer capacity;
	// constructor

	public Car() {
		super();
	}

	public Car(String id, String color, String model, Integer capacity) {
		super();
		this.id = id;
		this.color = color;
		this.model = model;
		// bound,unbound, auto-bound : chuyen tu nguyen thuy sang kieu doi tuong

		if (capacity == null || capacity <= 0) {
			throw new RuntimeException("Invalid capacity!");
		}
		this.capacity = capacity;
	}

	@Override
	public String toString() {

		return id + "," + color + "," + model + "," + currentPassenger;
	}

	public void setCapacity(Integer capacity) {
		if (capacity == null || capacity <= 0) {
			throw new RuntimeException("Invalid capacity!");
		}
		this.capacity = capacity;
	}

	public void setCurrentPassenger(int currentAmountOfPeople) {
		if (currentAmountOfPeople > this.capacity) {
			System.out.println("customer cannot exceed " + this.capacity);
			return;
		}
		this.currentPassenger = currentAmountOfPeople;
	}

	public boolean transfer(Car received, int quantity) {
		int max = received.currentPassenger + quantity;
		int min = currentPassenger - quantity;
		if (max > received.capacity || min < 0) {
			return false;
		}
		received.currentPassenger += quantity;
		currentPassenger -= quantity;
		return true;
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.id = "123abc";
		c1.color = "green";
		c1.model = "benz";
		c1.setCapacity(0);
		c1.setCurrentPassenger(6);

		Car c2 = new Car("456xyz", "yellow", "lambo", 8);
		c2.currentPassenger = 3;

		c1.transfer(c2, 1);
		System.out.println(c1);
		System.out.println(c2);
	}
}
