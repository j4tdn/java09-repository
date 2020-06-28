package beans;

import java.time.LocalDate;

public class DeviceDetail {
	private Customer customer;
	private Device[] devices;
	private LocalDate date;

	// default constructor
	public DeviceDetail() {

	}

	public DeviceDetail(Customer customer, Device[] device, LocalDate date) {
		super();
		this.customer = customer;
		this.devices = device;
		this.date = date;
	}

	// getter setter
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
