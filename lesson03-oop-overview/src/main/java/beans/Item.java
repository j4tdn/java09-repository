package beans;

public class Item {
	private String devId;
	private String operateSystem;
	private String color;
	private double cost;
	
	public Item() {
	}
	
	public Item(String devId, String operateSystem, String color, double cost) {
		this.devId = devId;
		this.operateSystem = operateSystem;
		this.color = color;
		this.cost = cost;
	}

	public String getDevId() {
		return devId;
	}

	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getOperateSystem() {
		return operateSystem;
	}

	public void setOperateSystem(String operateSystem) {
		this.operateSystem = operateSystem;
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
