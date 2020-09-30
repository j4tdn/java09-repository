package Ex05;

public class KhachHang {
	int id;
	String nameP;
	int phone;
	int address;
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}
	public KhachHang(int id, String nameP, int phone, int address) {
		super();
		this.id = id;
		this.nameP = nameP;
		this.phone = phone;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameP() {
		return nameP;
	}
	public void setNameP(String nameP) {
		this.nameP = nameP;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "KhachHang [id=" + id + ", nameP=" + nameP + ", phone=" + phone + ", address=" + address + "]";
	}
	
	

}
