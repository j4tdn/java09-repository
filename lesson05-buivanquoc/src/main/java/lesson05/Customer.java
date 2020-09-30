package lesson05;

public class Customer {
private String iDKH;
private String name;
private String phone;
private String address;
public Customer() {
	// TODO Auto-generated constructor stub
}
public String getiDKH() {
	return iDKH;
}
public void setiDKH(String iDKH) {
	this.iDKH = iDKH;
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
public Customer(String iDKH, String name, String phone, String address) {
	super();
	this.iDKH = iDKH;
	this.name = name;
	this.phone = phone;
	this.address = address;
}
}
