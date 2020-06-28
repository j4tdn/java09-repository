package beans;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String phonenumber;
	private String id;
	private String address;
	private List<Phone> phones;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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
	
	public Customer() {
	}
	
	public Customer(String name, String phonenumber, String id, String address) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.id = id;
		this.address = address;
	}
	
	public void addPhone(Phone phone) {
		if(phones == null) {
			phones = new ArrayList<>();
		} else {
			phones.add(phone);
		}
	}
	
	public List<Phone> getPhones() {
		return phones;
	}
	
	@Override
	public String toString() {
		return "Họ tên: " + this.name + ", sđt: " + this.phonenumber + ", chứng minh nhân dân: " + this.id + ", địa chỉ: " + this.address;
	}
	
}
