package beans;

public class ItemAdv {
	private String deviceCode;
	private String os;
	private String color;
	private double price;

	private ItemAdv() {
		// Item a = new Item();
	}

	public ItemAdv(Builder builder) {
		this.deviceCode = builder.deviceCode;
		this.os = builder.os;
		this.color = builder.color;
		this.price = builder.price;
	}

	public String getDeviceCode() {
		return deviceCode;
	}

	public String getOs() {
		return os;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "ItemAdv [deviceCode=" + deviceCode + ", os=" + os + ", color=" + color + ", price=" + price + "]";
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private String deviceCode;
		private String os;
		private String color;
		private double price;

		private Builder() {
		}

		public Builder deviceCode(String deviceCode) {
			this.deviceCode = deviceCode;
			return this;
		}

		public Builder os(String os) {
			this.os = os;
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

		public ItemAdv build() {
			return new ItemAdv(this);
		}
	}
}