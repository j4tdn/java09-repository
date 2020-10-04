package beanCopy;

import beans.ItemAdv.Builder;

//////// chua lam xongggggggg
public class ItemAdv {
	private String id;
	private String os;
	private String color;
	private double price;
	
	private ItemAdv() { // de no ko the tu khoi tao doi tuong cho chinh no
	}

	public ItemAdv(String id, String os, String color, double price) {
		super();
		this.id = id;
		this.os = os;
		this.color = color;
		this.price = price;
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
	
	public class Builder {
		private String id;
		private String os;
		private String color;
		private double price;
		
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
	}
	
}
