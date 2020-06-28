package beans;

import java.time.LocalDate;

public class ItemDetail {
	private Customer customer;
	private Device[] devices;
	private LocalDate date;
	
	
	
	public ItemDetail() {
		// TODO Auto-generated constructor stub
	}

	public ItemDetail(Customer customer, Device[] devices, LocalDate date) {
		this.customer = customer;
		this.devices = devices;
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Device[] getDevice() {
		return devices;
	}

	public void setDevice(Device[] device) {
		this.devices = device;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	

}
