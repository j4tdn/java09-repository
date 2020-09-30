package ex05;

public class Customer {
	private int id;
	private String name;
	private String phoneNumbers;
	private String address;
	
	public Customer() {
	}
	public Customer(int id, String name, String phoneNumbers, String address) {
		this.id = id; 
		this.name = name;
		this.phoneNumbers = phoneNumbers; 
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
