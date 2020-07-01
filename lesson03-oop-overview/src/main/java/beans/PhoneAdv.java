package beans;

import java.text.NumberFormat;
import java.util.Locale;

public class PhoneAdv {
	private String code;
	private String operatingSystem;
	private String color;
	private double price;

	private PhoneAdv() {
	}

	private PhoneAdv(Builder builder) {
		this.code = builder.code;
		this.operatingSystem = builder.operatingSystem;
		this.color = builder.color;
		this.price = builder.price;
	}

	public String getCode() {
		return code;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public static Builder builder() {
		return new Builder();
	};

	public static class Builder {
		private String code;
		private String operatingSystem;
		private String color;
		private double price;

		public Builder code(String code) {
			this.code = code;
			return this;
		}

		public Builder operatingSystem(String operatingSystem) {
			this.operatingSystem = operatingSystem;
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
	};

	private String formatPrice() {
		return NumberFormat.getCurrencyInstance(new Locale("vi", "VN")).format(price);
	}

	@Override
	public String toString() {
		return "Mã thiết bị: " + this.code + ", hệ điều hành: " + this.operatingSystem + ", màu: " + this.color
				+ ", giá: " + formatPrice();
	}
}