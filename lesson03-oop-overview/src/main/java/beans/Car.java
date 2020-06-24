package beans;

public class Car {
	// attributes
	private String id;
	private String color;
	private String model;
	private Integer capacity; // sức chứa

	private int currentPassenger; // number of pp in car at the moment

	public void setPassenger(int currentAmountOfpeople) {
		if (currentPassenger > this.capacity) {
			System.out.println("customers cannot exceed" + capacity);
			return;
		}
		this.currentPassenger = currentPassenger;
	}

	// defaut constructor
	public Car() {

	}

	// constructor
	public Car(String pid, String pcolor, String pmodel, Integer pcapacity) {
		// phải đặt tên khác nếu không nó chỉ hiểu ở hiện tại{
		id = pid;
		color = pcolor;
		model = pmodel;
		/*
		 * if (capacity > 0) // bound-unbound-autobound không cần ép kiểu đổi int qua
		 * Int.. { capacity = pcapacity;
		 */

		if (pcapacity == null || pcapacity <= 0) {

			throw new RuntimeException("Invalid capacity!");
		}
		capacity = pcapacity;
	}

	// ham khoi tao khong co kieu du lieu tra ve. Ten ham khoi tao trung ten Class
	@Override
	public String toString() {
		return id + "," + color + "," + model + "," + currentPassenger;
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
		// Iteger a = new integer(5) a la tham chieu
		Car c1 = new Car();
		c1.id = "123abc";
		c1.color = "green";
		c1.model = "benz";
		c1.capacity = 4;
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
