package bai5;

public class SachThamKhao extends Sach {
	private int Thue;
//	public SachThamKhao() {
//	}
	public int getThue() {
		return Thue;
	}
	public void setThue(int thue) {
		Thue = thue;
	}
	public SachThamKhao(String maSach, int donGia, String nhaXuatBan ,int thue) {
		MaSach = maSach;
		DonGia = donGia;
		NhaXuatBan = nhaXuatBan;
		Thue = thue;
	}
	public String toSstring() {
	    return this.MaSach;
	}
}
