package beans;

public class DevicesAdvange {
	private String id;
	private String os;
	private String color;
	private double price;

	private DevicesAdvange() {

	}

	private DevicesAdvange(Builder builder) {
		this.id = builder.id;
		this.os = builder.os;
		this.color = builder.color;
		this.price = builder.price;
	}

	public String getId() {
		return id;
	}

	public String getHDH() {
		return os;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return id + " ; "+ os+" ; "+color+" ; "+price; 
	}
	
	public static Builder builder() {
		return new Builder();
	}

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
		public DevicesAdvange build() {
			return new DevicesAdvange(this);
		}

	}

}
