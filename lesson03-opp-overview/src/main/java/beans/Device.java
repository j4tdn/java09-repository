package beans;

public class Device {
	private String code;
	private String ops;
	private String color;
	private double price;

	// defalt constructor
	public Device() {

	}

	public Device(String code, String ops, String color, double price) {
		super();
		this.code = code;
		this.ops = ops;
		this.color = color;
		this.price = price;
	}

//getter setter
	public void setCode(String code) {
		this.code = code;
	}

	public void setOps(String ops) {
		this.ops = ops;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public String getOps() {
		return ops;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

}
