package beans;

public class Car {
	//attributes
	private String id;
	private String color;
	private String model;
	private Integer capacity; //sức chứa 
	private int currentPassengers;
	public Car() {		
	}
	public Car(String pid,String pColor,String pmodel,Integer capacity) {
		this.id=pid;
		this.color=pColor;
		this.model=pmodel;
		if(capacity==null||capacity<=0) {
			throw new RuntimeException("Invalid capacity!!!");
		}
		this.capacity=capacity;
	}
	public void setCurrentPassengers(Integer currentPassengers) {
		/*if(currentPassengers>this.capacity) {
			System.out.println("Customer cannot exceed "+this.capacity);
			return;
		}*/
		this.currentPassengers=currentPassengers;
	}
	public void setCapacity(Integer pcapacity) {
		if(pcapacity==null||pcapacity<=0) {
			throw new RuntimeException("Invalid capacity!!!");
		}
		System.out.println("come here");
		this.capacity=capacity;
	}
	//setter, getter
	public void setId(String id) {
		this.id=id;
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
	public int getCurrentPassengers() {
		return currentPassengers;
	}
	@Override
	public String toString() {
		return id+" "+model+" "+color+" "+currentPassengers;
				}
	public boolean transfer(Car received,int qty) {
		//if(received.currentAmountOfPeople+qty>received.capacity||this.currentAmountOfPeople-qty<0)
		int max=received.currentPassengers+qty;
		int min = received.currentPassengers-qty;
		if(max>received.capacity||min<0) {
			return false;
		}
		received.currentPassengers +=qty;
		this.currentPassengers-=qty;
		return true;
		
	}

}
