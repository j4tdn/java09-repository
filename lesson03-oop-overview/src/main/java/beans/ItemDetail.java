package beans;

import java.time.LocalDate;

public class ItemDetail {
	private Customer customer;
	private Phone[] phones;
	private LocalDate date;

	public ItemDetail() {
	}

	public ItemDetail(Customer customer, Phone[] phones, LocalDate date) {
		this.customer = customer;
		this.phones = phones;
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Phone[] getPhones() {
		return phones;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
