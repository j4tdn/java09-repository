package beans;

import java.time.LocalDate;

import view.Customer;
import view.Item;

public class ItemDetail {
	private  Customer custom;
	private Item[] items;
	private LocalDate date;
	
	public ItemDetail() {
		
	}

	public ItemDetail(Customer custom, Item[] items, LocalDate date) {
		this.custom = custom;
		this.items = items;
		this.date = date;
	}

	public Customer getCustom() {
		return custom;
	}

	public void setCustom(Customer custom) {
		this.custom = custom;
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
