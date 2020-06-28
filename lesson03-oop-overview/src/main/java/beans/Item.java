package beans;

public class Item {
    private String id;
    private String operateSystem;
    private String color;
    private double cost;
	public Item() {
		super();
	}
	public Item(String id, String operateSystem, String color, double cost) {
		super();
		this.id = id;
		this.operateSystem = operateSystem;
		this.color = color;
		this.cost = cost;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
