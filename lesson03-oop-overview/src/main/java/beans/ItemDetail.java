package beans;

import java.time.LocalDate;

import view.Customers;
import view.Item;

public class ItemDetail {
	private Customers customer ;
	private Item[] items;
	private LocalDate date;
	
	
	public ItemDetail () {
		
	}


	public ItemDetail(Customers customers, Item[] item, LocalDate date) {
		super();
		this.customer = customers;
		this.items = item;
		this.date = date;
	}


	public Customers getCustomers() {
		return customer;
	}


	public void setCustomers(Customers customers) {
		this.customer = customers;
	}


	public Item[] getItem() {
		return items;
	}


	public void setItem(Item[] item) {
		this.items = item;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}