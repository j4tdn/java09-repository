package Bai4;

public class NhanVien extends People {
	private String tenDonVi;

	public NhanVien() {

	}

	public NhanVien(String tenDonVi) {

		this.tenDonVi = tenDonVi;
	}

	public void nhapThongTin() {
		System.out.print("Nhập tên phòng ban: ");
		tenDonVi = scanner.nextLine();
	}

	@Override
	public void tinhLuong() {
		luongNhanVien = (long) (hesoluong * 1250000);
	}

	public String toString() {
		return " Phòng ban: " + tenDonVi;
	}
}