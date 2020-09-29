package Bai4;

public class TruongPhong extends People {
	private int soNhanVien;
	public TruongPhong() {
		super();
	}
	
	public TruongPhong(int soNhanVien) {
		super();
		this.soNhanVien=soNhanVien;
	}
	
	public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhập số nhân viên đang quản lý: ");
        soNhanVien = scanner.nextInt();
    }
	@Override
	public void tinhLuong() {
		luongNhanVien = (long) (hesoluong *2200000);
		
	}
	public String toString() {
        return super.toString() + ", Số nhân viên đang quản lý: " + this.soNhanVien;
    }

}
