package beans;

public class Device {
	private String idDevice;
	private String operatorSystem;
	private String color;
	private Double price;
	
	

	public Device(String idDevice, String operatorSystem, String color, Double price) {
		this.idDevice = idDevice;
		this.operatorSystem = operatorSystem;
		this.color = color;
		this.price = price;
	}
	

	public String getIdDevice() {
		return idDevice;
	}

	public void setIdDevice(String idDevice) {
		this.idDevice = idDevice;
	}

	public String getOperatorSystem() {
		return operatorSystem;
	}

	public void setOperatorSystem(String operatorSystem) {
		this.operatorSystem = operatorSystem;
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
