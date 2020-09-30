package ex05;

import java.io.ObjectInputStream.GetField;

public class Book {
	private String id;
	private int price;
	private String company;
	
	public Book(String id, int price, String company) {
		this.id = id;
		this.price = price;
		this.company = company;
	}
	@Override
	public String toString() {
		return id+"   "+price+"   "+company+"   ";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
