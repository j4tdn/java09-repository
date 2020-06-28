package beans;

public class Phone {
	private String phoneId;
	private String system;
	private String color;
	private Double price;
	
	public Phone() {
	}
	public Phone(String phoneId, String system, String color, Double price) {
		this.phoneId = phoneId;
		this.system = system;
		this.color = color;
		this.price = price;
	}
	public String getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void sale(Double sale) {
		this.price = this.price * (1 - sale);
	}
}
