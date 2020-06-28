package view;

public class Custom {
	private String id;
	private String Fullname;
	private String Phone;
	private String Address;

public Custom() {
	
}
public Custom(String Fullname, String Phone, String id, String Address) {
	Fullname= Fullname;
	Phone = Phone;
	id = id;
	Address = Address;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFullname() {
	return Fullname;
}
public void setFullname(String fullname) {
	Fullname = fullname;
}
public String getPhone() {
	return Phone;
}
public void setPhone(String phone) {
	Phone = phone;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}


}
