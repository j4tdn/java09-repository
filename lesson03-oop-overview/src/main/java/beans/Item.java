package beans;

public class Item {
	private String deviceCode;
	private String os;
	private String color;
	private double price;

	
	public Item() {
		// Item a = new Item();
	}

	public Item(String pdeviceCode, String pos, String pcolor, double pprice) {
		this.deviceCode = pdeviceCode;
		this.os = pos;
		this.color = pcolor;
		this.price = pprice;
	}

	public String getDeviceCode() {
		return deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
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