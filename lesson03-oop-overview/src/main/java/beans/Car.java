package beans;

public class Car {
	
	//attributes : thuộc tính;
	private String id;
	private String color;
	private String model;
	private Integer capacilty;
	//số khách đang ở trên xe
	private int currentPassengers; 
	
	//constructor
	public Car(String pid, String pcolor, String pmodel, Integer pcapacilty) {
			id = pid;
			color = pcolor;
			model = pmodel;
			if ( pcapacilty <= 0 || pcapacilty == null) {
				throw new RuntimeException("Invalid capacilty");
			}
			capacilty = pcapacilty;
		}
		
	public Car() {
			
		}
	
	public void setCurrentPassengers (Integer currentPassengers) {
		if (currentPassengers > this.capacilty) {
			System.out.println("customer cannot exceed  " + this.capacilty);
			return;
		}
		this.currentPassengers = currentPassengers;
	}
	
	public void setCapacilty (Integer pcapacilty) {
		if ( pcapacilty <= 0 || pcapacilty == null) {
			throw new RuntimeException("Invalid capacilty");
		}
		System.out.println("come here!");
		this.capacilty = pcapacilty;	
	}
	
	
	@Override
	public String toString() {
		
		return id+ "," + color+ "," + model + "," + currentPassengers;
	}
	
	public boolean transper(Car received, int qty) {
		int max = received.currentPassengers + qty;
		int min = currentPassengers - qty;
		
		if (max > received.capacilty || min < 0) {
			return false;
		}
		
		received.currentPassengers += qty;
		
		currentPassengers -= qty;
		
		return true;
	}
	

	public static void main(String[] args) {
		
		
		Car c1 = new Car();
		c1.id = "123abc";
		c1.color = "green";
		c1.model = "benz";
		c1.setCapacilty(8);
		
		c1.setCurrentPassengers(6);
		
		
				
		Car c2 = new Car("123456","pink","huyndai",8);
		
		c2.setCurrentPassengers(3);

		
		c1.transper(c2, 1);
		
		System.out.println(c1);
		System.out.println(c2);

	}

}
