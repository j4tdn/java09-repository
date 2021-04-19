package persistence;

public class Employee {
	public static String ID="emId";
	public static String FULLNAME="fullname";
	public static String EMAIL="email";
	public static String ADDRESS="address";
	
	private Integer emId;
	private String fullname;
	private String	email;
	private String address;
	public Employee() {
		
	}
	
	public Employee(Integer emId, String fullname, String email, String address) {
		super();
		this.emId = emId;
		this.fullname = fullname;
		this.email = email;
		this.address = address;
	}
	public Integer getEmId() {
		return emId;
	}
	public void setEmId(Integer emId) {
		this.emId = emId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [emId=" + emId + ", fullname=" + fullname + ", email=" + email + ", address=" + address + "]";
	}
	
}
