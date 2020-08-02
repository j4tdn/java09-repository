package beans;

public class Car {
	// attributes
	private String id;
	private String color;
	private String model;
	private Integer capacity;

	private int currentPassenger;

	public Car() {

	}

	// constructor
	public Car(String pid, String pcolor, String pmodel, Integer pcapacity) {

		id = pid;
		color = pcolor;
		model = pmodel;

		if (pcapacity == null || pcapacity <= 0) {

			throw new RuntimeException("Invalid capacity!");
		}
		capacity = pcapacity;
	}

	
	public void setId(String id) {
		this.id = id;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setCapacity(Integer capacity) {
		if (capacity == null || capacity <= 0) {

			throw new RuntimeException("Invalid capacity!");
		}
		System.out.println("Come here!");
		this.capacity = capacity;

	}

	public void setPassenger(int currentPassenger) {
		if (currentPassenger > this.capacity) {
			System.out.println("customers cannot exceed" + capacity);
			return;
		}
		this.currentPassenger = currentPassenger;
	}

	// defaut constructor

	// ham khoi tao khong co kieu du lieu tra ve. Ten ham khoi tao trung ten Class
	@Override
	public String toString() {
		return id + "," + color + "," + model + "," + currentPassenger;
	}

	public int getCurrentPassenger() {
		return currentPassenger;
	}

	public void setCurrentPassenger(int currentPassenger) {
		this.currentPassenger = currentPassenger;
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

	public boolean transfer(Car received, int qty) {
		int max = received.currentPassenger + qty;
		int min = received.currentPassenger - qty;

		if (max > received.capacity || min < 0)

		{
			return false;
		}

		received.currentPassenger += qty;
		currentPassenger -= qty;
		return true;
	}

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.id = "123abc";
		c1.color = "green";
		c1.model = "benz";
		c1.setCapacity(6);
		c1.setPassenger(6);

		c1.currentPassenger = 6;
		System.out.println(c1);

		Car c2 = new Car("456xyz", "orange", "lambo", 8);
		c2.currentPassenger = 3;
		c1.transfer(c2, 1);
		c1.setPassenger(6);

		System.out.println(c2);

	}

}
