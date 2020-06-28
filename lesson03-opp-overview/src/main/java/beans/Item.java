package beans;

public class Item {
	private String id;
	private String os;
	private String color;
	private double price;

	public Item() {

	}

	public Item(String id, String operator, String color, int price) {
		super();
		this.id = id;
		this.os = operator;
		this.color = color;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOperator() {
		return os;
	}

	public void setOperator(String operator) {
		this.os = operator;
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
