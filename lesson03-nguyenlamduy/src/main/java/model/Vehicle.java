package model;

public class Vehicle {

	private String owner, type;
	private int cC;
	private long price;
	private double tax;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String owner, String type, int cC, long price) {
		this.owner = owner;
		this.type = type;
		this.cC = cC;
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getcC() {
		return cC;
	}

	public void setcC(int cC) {
		this.cC = cC;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public double getTax() {
		return this.tax;
	}

	public void setTax() {
		this.tax = thue();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return owner + "	" + type + "		" + cC + "		" + tax;
	}

	public double thue() {
		if (this.cC < 100) {
			this.tax = this.price *= 0.01;
			return this.tax;
		}
		if (this.cC <= 200) {
			this.tax = this.price *= 0.03;
			return this.tax;

		}
		return this.tax = this.price *= 0.05;
	}

}
