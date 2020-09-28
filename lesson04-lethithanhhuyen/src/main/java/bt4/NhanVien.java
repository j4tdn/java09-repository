package bt4;

public class NhanVien extends People{
	private float hsLuong;
	private String tenDv;
	
	public NhanVien() {
		
	}
	
	public NhanVien(String name,int year, float hsLuong, String tenDv) {
		this.name = name;
		this.year = year;
		this.hsLuong = hsLuong;
		this.tenDv = tenDv;
	}

	public float getHsLuong() {
		return hsLuong;
	}

	public void setHsLuong(float hsLuong) {
		this.hsLuong = hsLuong;
	}

	public String getTenDv() {
		return tenDv;
	}

	public void setTenDv(String tenDv) {
		this.tenDv = tenDv;
	}
	
	public long luong() {
		return (long) (this.hsLuong*3000000);
	}
	
	@Override
	public String toString() {
		return "Nhân viên: "+this.name+"\t"+this.year+"\tHS lương: "+this.hsLuong+"\tTên đơn vị: "+this.tenDv;
	}
}
