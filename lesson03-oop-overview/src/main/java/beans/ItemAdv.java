package beans;

import java.util.Objects;

public class ItemAdv {
	private String id;
	private String os;
	private String color;
	private double price;

	private ItemAdv() {
	}

	private ItemAdv(Builder builder) {
		this.id = builder.id;
		this.os = builder.os;
		this.color = builder.color;
		this.price = builder.price;
	}

	public String getId() {
		return id;
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
		return id + ", " + os + ", " + color + ", " + price;
	}

	public static Builder builder() {
		return new Builder();
	}

	// nested class
	public static class Builder {
		private String id;
		private String os;
		private String color;
		private double price;

		private Builder() {

		}

		public Builder id(String id) {
			this.id = id;
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
