package exercises;

public class Vehicle {
	private String carOwner;
	private String kindOfCar;
	private int cylinderCapacity;
	private float price;
	private float tax;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String carOwner, String kindOfCar, int cylinderCapacity, float price) {
		super();
		if (carOwner == null || carOwner == "") {
			throw new RuntimeException("Invalid car owner!");
		}
		this.carOwner = carOwner;
		this.kindOfCar = kindOfCar;
		if (cylinderCapacity < 0) {
			throw new RuntimeException("Invalid cylinder capacity!");
		}
		this.cylinderCapacity = cylinderCapacity;
		this.price = price;
		if (this.cylinderCapacity < 100) {
			this.tax = this.price * 0.01F;
		} else if (this.cylinderCapacity <= 200) {
			this.tax = this.price * 0.03F;
		} else {
			this.tax = this.price * 0.05F;
		}
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		if (carOwner == null || carOwner == "") {
			throw new RuntimeException("Invalid car owner!");
		}
		this.carOwner = carOwner;
	}

	public String getKindOfCar() {
		return kindOfCar;
	}

	public void setKindOfCar(String kindOfCar) {
		this.kindOfCar = kindOfCar;
	}

	public int getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(int cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getTax() {
		return tax;
	}
}
