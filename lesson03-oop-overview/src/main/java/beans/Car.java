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
	public void setCurrentPassenger(int currentPassengers) {
		if(currentPassengers>this.capacity) {
			System.out.println("Customer cannot exceed "+this.capacity);
			return;
		}
		this.currentPassengers=currentPassengers;
	}
	public void setCapacity(Integer pcapacity) {
		if(pcapacity==null||pcapacity<=0) {
			throw new RuntimeException("Invalid capacity!!!");
		}
		System.out.println("come here");
		this.capacity=capacity;
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
	public static void main(String[] args) {
		Car c1=new Car();
		c1.id="abc";
		c1.color="green";
		c1.model="benz";
		//c1.currentAmountOfPeople=2;
		c1.setCapacity(8);
		c1.setCurrentPassenger(3);
		//c1.setCapacity(8);
		
		Car c2=new Car("456","organe","lambo",8);
		c2.currentPassengers=3;
		System.out.println(c1);
		System.out.println(c2);
	}
}
