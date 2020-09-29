package bai4;

import java.util.Scanner;

public class TruongPhong extends People {
	private int soLuongNVQL;
	Scanner sc = new Scanner(System.in);
	public TruongPhong() {
		// TODO Auto-generated constructor stub
	}
	public int getSoLuongNVQL() {
		return soLuongNVQL;
	}
	public void setSoLuongNVQL(int soLuongNVQL) {
		this.soLuongNVQL = soLuongNVQL;
	}
	public TruongPhong(int soLuongNVQL) {
		super();
		this.soLuongNVQL = soLuongNVQL;
	}
	
	public double luong(double heSoLuong) {
		return (heSoLuong) * 2200000;
	}
	public void inputTP() {
		System.out.print("Số nhân viên quản lí :");
		int snv = Integer.parseInt(sc.nextLine());
		this.soLuongNVQL = snv;
	}
	public void outputTP() {
		System.out.printf(" %-20s %-15s %-15s %-15s %-15s\n","Họ tên","Năm sinh","Hệ số lương",
				"Số nv quản lí","Lương");
		System.out.printf(" %-20s %-15s %-15.2f %-15d %-15.2f\n",hoTen,namSinh,heSoLuong,soLuongNVQL,luong(heSoLuong));
	}
}
