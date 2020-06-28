package view;

public class Item {
	private String id;
	private String system;
	private String color;
	private double cost;
	

	public Item(String id, String system, String color, double cost) {
		
		this.id = id;
		this.system = system;
		this.color = color;
		this.cost = cost;
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	
}
