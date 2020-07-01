package beans;

public class ItemAdv {
	private String id;
	private String system;
	private String color;
	private double cost;

	private ItemAdv() {

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	return id + ", " + color + ", " + system + "," + cost;
	}

	public ItemAdv(String id, String system, String color, double cost) {
		super();
		this.id = id;
		this.system = system;
		this.color = color;
		this.cost = cost;
	}
	private ItemAdv(Builder builder) {
		this.id = builder.id;
		this.system = builder.system;
		this.color = builder.color;
		this.cost = builder.cost;
	}

	public String getId() {
		return id;
	}

	public String getSystem() {
		return system;
	}

	public String getColor() {
		return color;
	}

	public double getCost() {
		return cost;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private String id;
		private String system;
		private String color;
		private double cost;
		
		private Builder() {
			
		}

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder system(String system) {
			this.system = system;
			return this;
		}

		public Builder color(String color) {
			this.color = color;
			return this;
		}

		public Builder cost(double cost) {
			this.cost = cost;
			return this;
		}

		public ItemAdv build() {
			return new ItemAdv(this);
		}
		
	}

	

}
