package exercise2;

public class Vehicle {
	private String ownerName;
	private String name;
	private int capacity;
	private float price;
	private float tax;

	public Vehicle() {

	}

	public Vehicle(String ownerName, String name, int capacity, float price) {

		this.name = name;
		this.capacity = capacity;
		this.price = price;
		this.ownerName = ownerName;

		if (this.capacity < 100)
			this.tax = (float) (this.price * 0.01);
		else if (this.capacity < 200)
			this.tax = (float) (this.price * 0.03);
		
		else
			this.tax = (float) (this.price * 0.05);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tên chủ xe: " + ownerName + "\nLoại xe: " + name + "\nDung tích: " + capacity + "\nTrị giá: " +price + "\nThuế phải nộp: " + tax;
	}
}



