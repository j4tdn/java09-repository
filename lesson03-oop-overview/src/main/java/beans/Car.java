package beans;

public class Car {
	// attributes
	private String id;
	private String color;
	private String model;
	private Integer capacity;// sức chứa

	private int currentPassengers;

	public Car() {

	}

	public Car(String id, String color, String model, Integer capacity) {
		this.id = id;
		this.color = color;
		this.model = model;
		if (capacity == null || capacity <= 0) {
			throw new RuntimeException("Invalid capacity");
		}
		this.capacity = capacity;
	}
	
	public void setCapacity(Integer capacity) {
		if (capacity == null || capacity <= 0) {
			throw new RuntimeException("Invalid capacity");
		}
		this.capacity = capacity;
	}
	
	public void setCurrentPassengers(int currentAmountOfPeople) {
		if (currentAmountOfPeople > this.capacity) {
			System.out.println("customers cannot exceed " + this.capacity);
			return;
		}
		this.currentPassengers = currentAmountOfPeople;
	}

	@Override
	public String toString() {
		return id + ", " + color + ", " + model + ", " + capacity + " ," + currentPassengers;
	}

	public boolean transfer(Car received, int qty) {
		if (this.currentPassengers < qty || (received.currentPassengers + qty) > received.capacity) {
			return false;
		}
		this.currentPassengers -= qty;
		received.currentPassengers += qty;
		return true;
	}

	public static void main(String[] args) {
		Car c1 = new Car("123", "green", "benz", 29);
		c1.setCurrentPassengers(6);

		Car c2 = new Car("456", "yellow", "bmw", 19);
		c2.setCurrentPassengers(3);

		System.out.println(c1.transfer(c2, 1));
		System.out.println(c1);
		System.out.println(c2);
	}
}
