package ex05;

public class Sach {
	private int maSach;
	private float donGia;
	private String NXB;
	public Sach() {
		// TODO Auto-generated constructor stub
	}
	public Sach(int maSach, float donGia, String nXB) {
		super();
		this.maSach = maSach;
		this.donGia = donGia;
		NXB = nXB;
	}
	public int getMaSach() {
		return maSach;
	}
	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public String getNXB() {
		return NXB;
	}
	public void setNXB(String nXB) {
		NXB = nXB;
	}
	

}
