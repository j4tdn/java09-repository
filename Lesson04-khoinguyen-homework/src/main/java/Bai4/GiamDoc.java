package Bai4;

public class GiamDoc extends People {
	private float hesochucvu;

	public GiamDoc() {

	}

	public void nhapThongTin() {
		System.out.print("Nhập hệ số chức vụ: ");
		hesochucvu = scanner.nextFloat();
	}

	@Override
	public void tinhLuong() {
		luongNhanVien = (long) ((hesoluong + hesochucvu) * 3000000);
	}

	@Override
	public String toString() {
		return " hệ số chức vụ: " + hesochucvu;
	}
}