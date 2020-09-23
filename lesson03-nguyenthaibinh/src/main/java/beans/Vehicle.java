package beans;

public class Vehicle {
	private Integer price;
	private Integer capacity;
	private String category;
	private String carOwner;
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	public Vehicle(Integer price, Integer capacity, String category, String carOwner) {
		super();
		this.price = price;
		this.capacity = capacity;
		this.category = category;
		this.carOwner = carOwner;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}
	
}
