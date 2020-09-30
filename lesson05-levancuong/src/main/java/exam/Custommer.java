package exam;

public class Custommer {
	private int id;
	private String name;
	private String address;
	private String phoneNunber;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNunber() {
		return phoneNunber;
	}
	public void setPhoneNunber(String phoneNunber) {
		this.phoneNunber = phoneNunber;
	}
	public Custommer() {
		
	}
	public Custommer(int id, String name, String address, String phoneNunber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNunber = phoneNunber;
	}
	
	
}
