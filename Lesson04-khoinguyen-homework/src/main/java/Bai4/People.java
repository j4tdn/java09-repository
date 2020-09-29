package Bai4;

import java.util.Scanner;

public abstract class People {
	private String tenNhanVien;
	private int namSinh;
	protected float hesoluong;
	protected long luongNhanVien;
	public void tinhLuong() {
		
	}
	Scanner scanner = new Scanner(System.in);

	public People() {

	}

	public People(String tenNhanVien, int namSinh, float hesoluong, long luongNhanVien) {
		this.tenNhanVien = tenNhanVien;
		this.namSinh = namSinh;
		this.hesoluong = hesoluong;
		this.luongNhanVien = luongNhanVien;
	}

	public void nhapThongTin() {
		System.out.print("Nhập tên nhân viên: ");
		tenNhanVien = scanner.nextLine();
		System.out.print("Nhập năm sinh: ");
		namSinh = scanner.nextInt();
		System.out.print("Nhập hệ số lương: ");
		hesoluong = scanner.nextFloat();
	}

	@Override
	public String toString() {
		return "Tên nhân viên: " + tenNhanVien + ", Năm sinh: " + namSinh + ", hệ số lương: " + hesoluong
				+ ", lương nhân viên: " + luongNhanVien;
	}
}