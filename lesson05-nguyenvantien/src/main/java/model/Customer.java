package model;

import java.util.ArrayList;

public class Customer {

	private String id;
	private String name;
	private String phone;
	private String address;
	private TextBook textBook;
	private RefeBook refeBook;

	public Customer() {

	}

	public Customer(String id, String name, String phone, String address, TextBook textBook, RefeBook refeBook) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.textBook = textBook;
		this.refeBook = refeBook;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public TextBook getTextBook() {
		return textBook;
	}

	public void setTextBook(TextBook textBook) {
		this.textBook = textBook;
	}

	public RefeBook getRefeBook() {
		return refeBook;
	}

	public void setRefeBook(RefeBook refeBook) {
		this.refeBook = refeBook;
	}

	public float pay(Customer customer) {

		float cost = 0;
		for (int i = 0; i < 2; i++) {
			if (customer.getTextBook().getBookId().substring(0, 3).equals("SGK")) {
				if (customer.getTextBook().getStatus().equals("cũ")) {
					cost += customer.getTextBook().getCost() * 0.7;
				} else {
					cost += customer.getTextBook().getCost();
				}
			} else {
				cost += customer.getRefeBook().getCost() * (1 + customer.getRefeBook().getTax());
			}

		}
		return cost;
	}

}
