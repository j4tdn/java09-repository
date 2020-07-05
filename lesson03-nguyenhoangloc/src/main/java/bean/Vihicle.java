package bean;
import java.util.Locale.Builder;
import java.util.Scanner;


public class Vihicle {
	private String name;
	private String model;
	private int capacity;
	private int price;
	private int tax;
	
	
	private Vihicle() {
	}

@Override
public String toString() {
	return name+"---"+model+"---"+capacity+"---"+price+"---"+tax;
}
Scanner sc=new Scanner(System.in);

	public Vihicle(String name, String model, int capacity, int price) {
		this.name = name;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
		this.tax = cacularTax();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getTax() {
		return tax;
	}


	public void setTax(int tax) {
		this.tax = tax;
	}
	public int cacularTax() {
		if (this.capacity < 100) {
			return tax=(int) (price *0.01);
			
		} else if (this.capacity <= 200) {
			return tax=(int) (this.price*0.03);		
		} else {
			return tax=(int) (this.price*0.05);
		}
		
		
	}
	
}
