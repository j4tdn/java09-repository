package ex05;

public class Customer {
	private String name;
	private String id;
	private String phoneNumber;
	private String address;

	public Customer() {
	}

	public Customer(String name, String id, String phoneNumber, String address) {
		super();
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
