package beans;

import java.time.LocalDate;

public class ItemDetail {
	private Customers customer;
	private Devices[] devices;
	private LocalDate date;
	
	public ItemDetail() {
	}

	public ItemDetail(Customers customer, Devices[] devices, LocalDate date) {
		super();
		this.customer = customer;
		this.devices = devices;
		this.date = date;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public Devices[] getDevices() {
		return devices;
	}

	public void setDevices(Devices[] devices) {
		this.devices = devices;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
