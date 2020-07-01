package beans;

public class ItemAdv {
	private String devId;
	private String operateSystem;
	private String color;
	private double cost;

	private ItemAdv() {
	}

	private ItemAdv(Builder builder) {
		this.devId = builder.devId;
		this.color = builder.color;
		this.cost = builder.cost;
	}

	public String getDevId() {
		return devId;
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

	@Override
	public String toString() {
		return "id: " + this.devId + " color: " + this.color + " cost: " + this.cost + " os: " + this.operateSystem;
	}

	public static Builder builder() {
		return new Builder();
	}

	// nested class: class lồng bên trong
	public static class Builder {
		private String devId;
		private String operateSystem;
		private String color;
		private double cost;

		private Builder() {

		}

		public Builder devId(String devId) {
			this.devId = devId;
			return this;
		}

		public Builder operateSystem(String operateSystem) {
			this.operateSystem = operateSystem;
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
