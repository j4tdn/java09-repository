package beans;

public class Car {
	// attributes
	private String id;
	private String color;
	private String model;
	// Number of people in car at the moment
	private int currentPassengers;
	private Integer capacity;

	// default constructor
	public Car() {
	}

	// constructor
	public Car(String id, String color, String model, Integer capacity) {
		this.id = id;
		this.color = color;
		this.model = model;
		if (this.capacity == null || this.capacity <= 0) {
			throw new RuntimeException("Invalid capacity!!!");
		}
		this.capacity = capacity;
	}

	public void setCapacity(Integer capacity) {
		if (this.capacity == null || this.capacity <= 0) {
			throw new RuntimeException("Invalid capacity!!!");
		}
		System.out.println("come here");
		this.capacity = capacity;
	}

	public void setCurrentPassengers(int currentAmountOfPeople) {
		if (currentAmountOfPeople > this.capacity) {
			System.out.println("customer cannot exceed " + capacity);
			return;
		}
		this.currentPassengers = currentAmountOfPeople;
	}

	public boolean transfer(Car received, int quantity) {
		int max = received.currentPassengers + quantity;
		int min = this.currentPassengers - quantity;
		received.currentPassengers += quantity;
		this.currentPassengers -= quantity;
		if (max > received.capacity || min < 0) {
			return false;
		}
		return true;

	}

	@Override
	public String toString() {
		return "id: " + id + ", color: " + color + ", model: " + model + ", current passengers: " + currentPassengers;
	}

	public static void main(String[] args) {
		Car c1 = new Car("123abc", "Green", "Lamborghini", 7);
		c1.setCurrentPassengers(6);

		Car c2 = new Car("456xyz", "Black", "Porsche", 9);
		c2.setCurrentPassengers(3);
		c1.transfer(c2, 1);
		System.out.println(c1);
		System.out.println(c2);
	}

}
