package bai4;

import java.util.Scanner;

public class NhanVien extends People {
	private String TenPB;
	Scanner sc = new Scanner(System.in);
	public NhanVien() {
		
	}
	public String getTenPB() {
		return TenPB;
	}

	public void setTenPB(String tenPB) {
		TenPB = tenPB;
	}

	public NhanVien(String tenPB) {
		super();
		TenPB = tenPB;
	}
	public double luong(double heSoLuong) {
		return (heSoLuong) * 1250000;
	}
	public void inputNV() {
		System.out.print("Tên phòng ban :");
		String pb = sc.nextLine();
		this.TenPB = pb;
	}
	public void outputNV() {
		System.out.printf(" %-20s %-15s %-15s %-15s %-15s\n","Họ tên","Năm sinh","Hệ số lương",
				"Phòng ban","Lương");
		System.out.printf(" %-20s %-15s %-15.2f %-15s %-15.2f\n",hoTen,namSinh,heSoLuong,TenPB,luong(heSoLuong));
	}
}
