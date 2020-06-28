package beans;

public class Phone {
	private String id;
	private String operatingSystem;
	private String color;
	private Double price;

	public Phone() {
	}

	public Phone(String id, String operatingSystem, String color, Double price) {
		this.id = id;
		this.operatingSystem = operatingSystem;
		this.color = color;
		this.price = price;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
