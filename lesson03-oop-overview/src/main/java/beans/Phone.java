package beans;

import java.text.NumberFormat;
import java.util.Locale;

public class Phone {
	private String code;
	private String operatingSystem;
	private String color;
	private double price;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String code, String operatingSystem, String color, double price) {
		this.code = code;
		this.operatingSystem = operatingSystem;
		this.color = color;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	private String formatPrice() {
		return NumberFormat.getCurrencyInstance(new Locale("vi", "VN")).format(price);
	}
	
	@Override
	public String toString() {
		return "Mã thiết bị: " + this.code + ", hệ điều hành: " + this.operatingSystem + ", màu: " + this.color + ", giá: " + formatPrice();
	}

}
