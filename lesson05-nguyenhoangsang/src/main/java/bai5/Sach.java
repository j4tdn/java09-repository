package bai5;

public class Sach {
	public String MaSach;
	public int DonGia;
	public String NhaXuatBan;
	public Sach() {
		// TODO Auto-generated constructor stub
	}
	public String getMaSach() {
		return MaSach;
	}
	public void setMaSach(String maSach) {
		MaSach = maSach;
	}
	public int getDonGia() {
		return DonGia;
	}
	public void setDonGia(int donGia) {
		DonGia = donGia;
	}
	public String getNhaXuatBan() {
		return NhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		NhaXuatBan = nhaXuatBan;
	}
	public Sach(String maSach, int donGia, String nhaXuatBan) {
		MaSach = maSach;
		DonGia = donGia;
		NhaXuatBan = nhaXuatBan;
	}
	public String toSstring() {
	    return this.MaSach;
	}
	
}
