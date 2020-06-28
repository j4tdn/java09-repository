package beans;

public class Customers {
	private String name;
	private String phonenumber;
	private String CMND;
	private String address;

	public Customers(String name, String phonenumber, String CMND, String address) {
		this.name = name;
		this.phonenumber = phonenumber;
		this.CMND = CMND;
		this.address = address;

	}

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

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String cMND) {
		CMND = cMND;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
