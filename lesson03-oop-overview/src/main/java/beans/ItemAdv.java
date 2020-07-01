package beans;

public class ItemAdv {
    private String id;
    private String operateSystem;
    private String color;
    private double cost;
	private ItemAdv() {
		super();
	}
	private ItemAdv (Builder builder) {
		this.id = builder.id;
		this.operateSystem = builder.operateSystem;
		this.color = builder.color;
		this.cost = builder.cost;
	}
	public String getId() {
		return id;
	}
	public String getOperateSystem() {
		return operateSystem;
	}
	public String getColor() {
		return color;
	}
	public double getCost() {
		return cost;
	}
	public static Builder builder () {
		return new Builder();
	}
	public String toString () {
		return id + "," + operateSystem +","+ color + "," + cost;
	}
	public static class Builder {
		private String id;
	    private String operateSystem;
	    private String color;
	    private double cost;
	    private Builder() {
	    	
	    }
	    public Builder id (String id) {
	    	this.id=id;
	    	return this;
	    }
	    public Builder os (String os) {
	    	this.operateSystem=os;
	    	return this;
	    }
	    public Builder color (String color) {
	    	this.color=color;
	    	return this;
	    }
	    public Builder cost (double cost) {
	    	this.cost=cost;
	    	return this;
	    }
	    
	    public ItemAdv build () {
	    	 return new ItemAdv(this);
	    }
	}
}
