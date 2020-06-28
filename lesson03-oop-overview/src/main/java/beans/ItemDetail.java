package beans;

import java.time.LocalDate;

public class ItemDetail {
	private Customer customer;
	private Item[] items;
	private LocalDate datel;
	
	public ItemDetail() {
	}

	public ItemDetail(Customer customer, Item[] items, LocalDate datel) {
		super();
		this.customer = customer;
		this.items = items;
		this.datel = datel;
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

	public LocalDate getDatel() {
		return datel;
	}

	public void setDatel(LocalDate datel) {
		this.datel = datel;
	}
	
}
