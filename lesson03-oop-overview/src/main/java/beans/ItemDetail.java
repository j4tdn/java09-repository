package beans;

import java.time.LocalDate;

public class ItemDetail {
	private Customer customer;
	private Item[] item;
	private LocalDate date;

	public ItemDetail() {
		super();
	}

	public ItemDetail(Customer customer, Item[] item, LocalDate date) {
		super();
		this.customer = customer;
		this.item = item;
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Item[] getItem() {
		return item;
	}

	public void setItem(Item[] item) {
		this.item = item;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
