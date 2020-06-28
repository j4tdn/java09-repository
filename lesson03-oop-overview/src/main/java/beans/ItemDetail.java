package beans;

import java.time.LocalDate;

public class ItemDetail {
	private Customer customer;
	private Item[] items;
	private LocalDate date;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
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
	
	public ItemDetail() {
	}
	
	public ItemDetail(Customer customer, Item[] item, LocalDate date) {
		this.customer = customer;
		this.items = item;
		this.date = date;
	}
	
	
}
