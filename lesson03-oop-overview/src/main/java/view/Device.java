package view;

public class Device {
	private String id;
	private String operatingSystem;
	private String color;
	private double price;
	public  Device() {
		
	}
	public Device(String id,String os,String color,double price) {
		this.id=id;
		this.operatingSystem=os;
		this.color=color;
		this.price=price;
		}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
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
