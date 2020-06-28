package view;

public class Device {
	private String id;
	private String system;
	private String color;
	private double price;
	
	public Device() {
	}
	public Device(String id, String system, String color, double price) {
		this.id = id;
		this.system = system;
		this.color = color;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
