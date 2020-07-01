package beans;

public class DeviceAdv {
	private String code;
	private String ops;
	private String color;
	private double price;

	// defalt constructor
	private DeviceAdv() {

	}
private DeviceAdv(Builder builder) {
	this.code = builder.code;
	this.ops = builder.ops;
	this.color = builder.color;
	this.price = builder.price;
}
//getter setter

	public String getCode() {
		return code;
	}

	public String getOps() {
		return ops;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Builder [code=" + code + ", ops=" + ops + ", color=" + color + ", price=" + price + "]";
	}
	
	public static Builder builder() {
		return new Builder();
		
		
	}
	// nested class
	public static class  Builder {
		private String code;
		private String ops;
		private String color;
		private double price;
		private Builder() {
			
		}

		public Builder code(String code) {
			this.code = code;
			return this;
		}
		
		
		public Builder ops(String ops) {
			this.ops = ops;
			return this;
		}

		
		public Builder color(String color) {
			this.color = color;
			return this;
		}

		public Builder price(Double price) {
			this.price = price;
			return this;
		}
		public DeviceAdv build() {
			
			return new DeviceAdv(this);
			
		}

	}

}
