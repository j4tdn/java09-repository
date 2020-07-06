package exercises;

public class Vehicle {
	private String carOwner;
	private String kindOfCar;
	private int capacity;
	private double price;
	private double tax;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String carOwner,String kindOfCar,int capacity,double price) {
		super();
		this.carOwner=carOwner;
		this.kindOfCar=kindOfCar;
		if(capacity<0) {
			throw new RuntimeException("Invalid capacity");
		}
		this.capacity=capacity;
		this.price=price;
		if(this.capacity<100) {
			this.tax=this.price*0.01f;
		}
		else if(this.capacity<=200) {
			this.tax=this.price*0.03f;
		}
		else this.tax=this.price*0.05f;
	}
	public String getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}
	public String getKindOfCar() {
		return kindOfCar;
	}
	public void setKindOfCar(String kindOfCar) {
		this.kindOfCar = kindOfCar;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
}
