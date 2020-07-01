package beans;

public class DeviceAdv {

	private String idDevice;
	private String operatorSystem;
	private String color;
	private double price;

	private DeviceAdv() {

	}

	private DeviceAdv(Builder builder) {
		this.idDevice = builder.idDevice;
		this.operatorSystem = builder.operatorSystem;
		this.color = builder.color;
		this.price = builder.price;
	}

	public static Builder builder() {
		return new Builder();
	}
	
	@Override
	public String toString() {
		
		return this.idDevice+" "+this.operatorSystem+ " "+this.color+"  "+this.price;
	}

	public static class Builder {
		private String idDevice;

		private String operatorSystem;
		private String color;
		private double price;

		private Builder() {

		}

		public Builder IdDevice(String idDevice) {
			this.idDevice = idDevice;
			return this;
		}

		public Builder OperatorSystem(String operatorSystem) {
			this.operatorSystem = operatorSystem;
			return this;
		}

		public Builder Color(String color) {
			this.color = color;
			return this;
		}

		public Builder Price(double price) {
			this.price = price;
			return this;
		}
		public DeviceAdv build() {
			return new DeviceAdv(this);
		}

	}

}
