package beans;

public class Devices {
	private String id;
	private String HDH;
	private String color;
	private double price;

	public Devices(String id, String HDH, String color, double price) {
		this.id = id;
		this.HDH = HDH;
		this.color = color;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHDH() {
		return HDH;
	}

	public void setHDH(String hDH) {
		HDH = hDH;
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
