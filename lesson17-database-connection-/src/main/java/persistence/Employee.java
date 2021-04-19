package persistence;

public class Employee {
	
	public static String ID = "empId";
	public static String FULLNAME = "fullname";
	public static String EMAIL = "email";
	public static String ADDRESS = "address";
	
	private Integer empId;
	private String fullName;
	private String email;
	private String address;
	public Employee() {
		super();
	}
	public Employee(Integer empId, String fullName, String email, String address) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.email = email;
		this.address = address;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
		return super.toString();
	}
}
