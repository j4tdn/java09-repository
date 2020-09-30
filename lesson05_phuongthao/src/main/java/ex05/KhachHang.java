package ex05;

public class KhachHang {
	private String MKH;
	private String tenKH;
	private int sdt;
	private String diaChi;
	
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}

	public KhachHang(String mKH, String tenKH, int sdt, String diaChi) {
		super();
		MKH = mKH;
		this.tenKH = tenKH;
		this.sdt = sdt;
		this.diaChi = diaChi;
	}

	public String getMKH() {
		return MKH;
	}

	public void setMKH(String mKH) {
		MKH = mKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	

}
