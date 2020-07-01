package beans;

public class PhoneAdv extends Object{
	private String phoneId;
	private String system;
	private String color;
	private Double price;
	
	private PhoneAdv() {
	}
	private PhoneAdv(Builder builder) {
		this.phoneId = builder.phoneId;
		this.system = builder.system;
		this.color = builder.color;
		this.price = builder.price;
		
	}
	public String getPhoneId() {
		return phoneId;
	}

	public String getSystem() {
		return system;
	}

	public String getColor() {
		return color;
	}

	public Double getPrice() {
		return price;
	}

	
	public void sale(Double sale) {
		this.price = this.price * (1 - sale);
	}
	
	@Override
	public String toString() {
		return phoneId + ", " + system + ", " + color + ", " + price;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	//nested class
	public static class Builder {
		private String phoneId;
		private String system;
		private String color;
		private Double price;
		
		public Builder id(String id) {
			this.phoneId = id;
			return this;
		}

		public Builder system(String system) {
			this.system = system;
			return this;
		}

		public  Builder color(String color) {
			this.color = color;
			return this;
		}

		public Builder price(Double price) {
			this.price = price;
			return this;
		}
		
		public PhoneAdv build() {
			return new PhoneAdv(this);
		}

	}

}
