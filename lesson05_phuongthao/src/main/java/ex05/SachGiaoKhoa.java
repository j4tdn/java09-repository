package ex05;

public class SachGiaoKhoa extends Sach {
	
	String tinhTrang;

	public SachGiaoKhoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SachGiaoKhoa(int maSach, float donGia, String nXB, String tinhTrang) {
		super(maSach, donGia, nXB);
		this.tinhTrang=tinhTrang;
		
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	
	
	
	

}
