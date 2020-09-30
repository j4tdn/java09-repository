package Bai4;

public class TruongPhong extends People {
	private int soNhanVien;

	public TruongPhong() {

	}

	public TruongPhong(int soNhanVien) {

		this.soNhanVien = soNhanVien;
	}

	public void nhapThongTin() {

		System.out.print("Nhập số nhân viên đang quản lý: ");
		soNhanVien = scanner.nextInt();
	}

	@Override
	public void tinhLuong() {
		luongNhanVien = (long) (hesoluong * 2200000);
	}

	public String toString() {
		return " Số nhân viên đang quản lý: " + soNhanVien;
	}
}