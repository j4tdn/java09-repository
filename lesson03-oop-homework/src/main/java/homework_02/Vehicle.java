package homework_02;

public class Vehicle {
	private String name ;
	private String type ;
	private double cylinder ;
	private double  price;
	private double tax;
	
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCylinder() {
		return cylinder;
	}

	public void setCylinder(double cylinder) {
		this.cylinder = cylinder;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Vehicle(String name, String type, double cylinder, double price) {
		
		this.name = name;
		this.type = type;
		this.cylinder = cylinder;
		this.price = price;
		
	}
	
	public double cacularTax() {
		if (this.cylinder < 100) {
			return tax=this.price *0.01;
			
		} else if (this.cylinder <= 200) {
			return tax=this.price*0.03;		
		} else {
			return tax=this.price*0.05;
		}
		
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-20s %-20s %20.2f %20.2f %20.2f", this.name, this.type, this.price, this.cylinder, cacularTax());
	}
	
	
}
