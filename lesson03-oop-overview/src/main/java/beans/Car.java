// thuộc tính -> method -> hàm khởi tạo

package beans;

public class Car {

	// attributes
	private String id;
	private String color;
	private String model;
	// catch error for capacity
	private Integer capacity; // sức chứa

	// number of people in cat at the moment
	private int currentPassengers;

	public Car() {

	}

	public Car(String pid, String pcolor, String pmodel, Integer pcapacity) {
		id = pid;
		color = pcolor;
		model = pmodel;
		if (pcapacity == null || pcapacity <= 0) {
			throw new RuntimeException("Invalid capacity !");
		}
	}

	public void setCapacity(Integer capacity) {
		if (capacity == null || capacity <= 0) {
			throw new RuntimeException("Invalid capacity !");
		
		}
		System.out.println("come here !");
		this.capacity = capacity;
	}

	public void setCurrentPassengers(int currentAmountOfPeople) {
		if (currentAmountOfPeople > this.capacity) {
			System.out.println("customer cannot exceed" + capacity);
			return;
		}
		this.currentPassengers = currentAmountOfPeople;
	}

	// constructor

	@Override
	public String toString() {
		return id + " , " + color + " , " + model + "  , " + currentPassengers;

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

	public static void main(String[] args) {
		// Integer a = new Integer(5);

		Car c1 = new Car();
		c1.id = "abc";
		c1.color = "green";
		c1.model = "benz";
		c1.setCapacity(8);
		c1.setCurrentPassengers(3);

		Car c2 = new Car("456xyz", "orrange", "lambo", 8);
		c2.setCurrentPassengers(6);

		c1.transfer(c2, 100);

		System.out.println(c1);
		System.out.println(c2);
	}
}
