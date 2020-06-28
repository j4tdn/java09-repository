package view;

import java.time.LocalDate;

public class ItemDetail {
	private Customer customer;
	private Device[] device;
	private LocalDate date;
	public ItemDetail() {
		
	}
	public ItemDetail(Customer customer,Device[] device,LocalDate date) {
		this.customer=customer;
		this.device=device;
		this.date=date;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Device[] getDevice() {
		return device;
	}
	public void setDevice(Device[] device) {
		this.device = device;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
