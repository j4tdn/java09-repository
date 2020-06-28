package beans;

public class Customer {
	private String name;
	private String phoneNumber;
	private String idNumber;
	private String address;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String phone, String idNumber, String address) {
		this.name = name;
		this.phoneNumber = phone;
		this.idNumber = idNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phoneNumber;
	}

	public void setPhone(String phone) {
		this.phoneNumber = phone;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
