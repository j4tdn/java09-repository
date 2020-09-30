package bai5;

public class SachGiaoKhoa extends Sach{
	private String TinhTrang;
	public SachGiaoKhoa() {
		// TODO Auto-generated constructor stub
	}
	public String getTinhTrang() {
		return TinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		TinhTrang = tinhTrang;
	}
	public SachGiaoKhoa(String maSach, int donGia, String nhaXuatBan , String tinhTrang) {
		MaSach = maSach;
		DonGia = donGia;
		NhaXuatBan = nhaXuatBan;
		TinhTrang = tinhTrang;
	}
	public String toSstring() {
	    return this.MaSach;
	}
}
