package beans;

public class Customer {
	private String id;
	private String name;
	private String phoneNumber;
	private String address;
	
	public Customer() {
	}
	
	public Customer(String name, String phoneNumber, String id, String address) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
