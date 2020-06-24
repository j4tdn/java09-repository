package beans;

public class Car {
	private String iD;
	private String color;
	private String model;

	// number off people in car at the moment
	private int Passengers;
	private Integer capacity;// suc chua

	public Car() {

	}

	// constructor
	public Car(String pid, String pcolor, String pmodel, Integer pcapacity) {
		iD = pid;
		color = pcolor;
		model = pmodel;
		if (pcapacity == null || pcapacity <= 0) {
			throw new RuntimeException("invalid capacticy");
		}
		capacity = pcapacity;
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

		return (iD + "   " + color + "   " + model + "   " + Passengers);
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
		Car c1 = new Car();
		c1.iD = "123";
		c1.color = "black";
		c1.model = "mec";
		c1.setCapacity(8);
		c1.setCurrentPassengers(6);

		Car c2 = new Car("456", "while", "lambo", 8);
		c2.Passengers = 5;
		c1.transfer(c2, 2);
		System.out.println(c1);
		System.out.println(c2);
	}
}
