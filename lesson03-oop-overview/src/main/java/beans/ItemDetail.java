package beans;

import java.time.LocalDate;

import view.Customers;

public class ItemDetail {
	private Customers customer ;
	private ItemAdv[] items;
	private LocalDate date;
	
	
	public ItemDetail () {
		
	}


	public ItemDetail(Customers customers, ItemAdv[] item, LocalDate date) {
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


	public ItemAdv[] getItem() {
		return items;
	}


	public void setItem(ItemAdv[] item) {
		this.items = item;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}