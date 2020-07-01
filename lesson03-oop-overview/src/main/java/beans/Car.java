package beans;

public class Car {

	// attributes :đặc điểm, thuộc tính;
	private String id;
	private String color;
	private String model;
	private Integer capacity;//sức chứa
	
	private int currentAmountOfPeople;//number or people in car at the moment
	
	//default constructor
	public Car() {			
	}
		//constructor
	public Car(String pid, String pcolor, String pmodel, Integer pcapacity) {
		id = pid;
		color = pcolor;
		model = pmodel;
		if (pcapacity == null || pcapacity <= 0) {
			throw new RuntimeException("Invalid capacity!!!");
		}
		capacity = pcapacity;		
	}
	
	public void setCapacity(Integer capacity) {
		if (capacity == null || capacity <= 0) {
			throw new RuntimeException("Invalid capacity!!!");
		}
		this.capacity = capacity;	
	}
	
	public void setCurrentPassenger(int currentPassenger) {
	if (currentPassenger <= this.capacity) {			
		this.currentAmountOfPeople = currentPassenger;
	} else {
		System.out.println("customer cannot exceed " + capacity);
	}
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
	public int getCurrentAmountOfPeople() {
		return currentAmountOfPeople;
	}
	
	
	@Override
	public String toString() {
		return id + ", " + color + ", " + model + " " + currentAmountOfPeople;
	}
	
	public boolean transfer(Car received, int qty) {
		int max = received.capacity + qty;
		int min = currentAmountOfPeople - qty;
		if (min < 0 || max > received.capacity) {
			return false;
		}		
		received.currentAmountOfPeople += qty;
		currentAmountOfPeople -= qty;
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.id = "123abc";
		c1.color = "green";
		c1.model = "benz";
		c1.setCapacity(8);
		c1.setCurrentPassenger(6);
		
		Car c2 = new Car("456xyz", "yellow", "lambo", 8);
		c2.currentAmountOfPeople = 3;	
		
		c1.transfer(c2, 1);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
