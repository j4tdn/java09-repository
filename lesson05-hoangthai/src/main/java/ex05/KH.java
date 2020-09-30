package ex05;

public class KH {
	private int id;
	private String name;
	private int phone;
	private String address;
	
	public KH(int id, String name, int phone, String address) {
		this.id = id;
		this.name = name;
		this.phone = phone;
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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "KH [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
}
