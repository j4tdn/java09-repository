package beans;

public class Customer {
	private String id;
	private String name;
	private String phone;
	private String address;
	
	//default constructor

	
	
public Customer() {
	
}

public Customer (String pname , String pphone, String paddress,String pid ) {
	this.name = pname;
	this.phone = pphone;
	this.address = paddress;
	this.id= pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
}