package Bai4;

public class NhanVien extends People {
	private String tenDonVi;
	public NhanVien() {
		super();
	}
	
	public NhanVien(String tenDonVi) {
		super();
		this.tenDonVi= tenDonVi;
	}
	
	public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhập tên phòng ban: ");
		tenDonVi = scanner.nextLine();
    }
	@Override
	public void tinhLuong() {
		luongNhanVien = (long) (hesoluong * 1250000);
		
	}
	public String toString() {
        return super.toString() + ", Phòng ban: " + this.tenDonVi;
    }

}
