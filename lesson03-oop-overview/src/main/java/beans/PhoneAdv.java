package beans;

public class PhoneAdv {
	private String id;
	private String operatingSystem;
	private String color;
	private Double price;

	private PhoneAdv() {
	}

	private PhoneAdv(Builder builder) {
		this.color = builder.color;
		this.price = builder.price;
		this.id = builder.id;
		this.operatingSystem = builder.operatingSystem;
	}

	public String getId() {
		return id;
	}

	public String getColor() {
		return color;
	}

	public Double getPrice() {
		return price;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	@Override
	public String toString() {
		return "PhoneAdv [id=" + id + ", operatingSystem=" + operatingSystem + ", color=" + color + ", price=" + price
				+ "]";
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private String id;
		private String operatingSystem;
		private String color;
		private Double price;

		private Builder() {
		}

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder operatingSystem(String os) {
			this.operatingSystem = os;
			return this;
		}

		public Builder color(String color) {
			this.color = color;
			return this;
		}

		public Builder price(double price) {
			this.price = price;
			return this;
		}

		public PhoneAdv build() {
			return new PhoneAdv(this);
		}
	}

}
