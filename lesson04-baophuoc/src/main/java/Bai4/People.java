package Bai4;

import java.util.Scanner;

public abstract class People {

	private String tenNhanVien;
	private String year;
	protected int hesoluong;
	protected long luongNhanVien;

	Scanner scanner = new Scanner(System.in);

	public People() {
		super();
	}

	public People(String tenNhanVien, long luongNhanVien) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.year = year;
		this.hesoluong = hesoluong;
		this.luongNhanVien = luongNhanVien;
	}

	public void nhapThongTin() {
		System.out.print("Nhập tên nhân viên: ");
		tenNhanVien = scanner.nextLine();
		System.out.print("Nhập năm sinh: ");
		year = scanner.nextLine();
		System.out.print("Nhập hệ số lương: ");
		hesoluong = scanner.nextInt();
		//hesoluong=Integer.parseInt(scanner.nextLine());   ---> XỬ LÝ TRÔI LỆNH NHƯNG BỊ ERROR
		
		
	}

	public abstract void tinhLuong();

	@Override
	public String toString() {
		return "Tên nhân viên: " + this.tenNhanVien + ", Năm sinh: " + this.year +", hệ số lương: " + this.hesoluong + ", lương nhân viên: "
				+ this.luongNhanVien + " VND";
	}
}
