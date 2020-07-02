package lesson03_OOP;

import java.time.LocalDate;

import view.Customer;
import view.Item;

public class ItemDetail {
	private Customer customers;
	private Item[] items;
	private LocalDate date;
	public ItemDetail() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemDetail(Customer customers, Item[] items, LocalDate date) {
		super();
		this.customers = customers;
		this.items = items;
		this.date = date;
	}

	public Customer getCustomers() {
		return customers;
	}
	public void setCustomers(Customer customers) {
		this.customers = customers;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	

}
