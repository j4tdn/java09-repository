package beans;

import java.time.LocalDate;

public class ItemDetail {
	private Customer customer;
	private Item[] items;
	private LocalDate date;

	public ItemDetail() {

	}

	public ItemDetail(Customer customer, Item[] items, LocalDate date) {
		super();
		this.customer = customer;
		this.items = items;
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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