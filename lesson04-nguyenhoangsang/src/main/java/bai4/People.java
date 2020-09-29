package bai4;

import java.util.Scanner;

public class People {
	public String hoTen;
	public int namSinh;
	public double heSoLuong;
	
	Scanner sc = new Scanner(System.in);
	
	public People() {
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public People(String hoTen, int namSinh, double heSoLuong) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.heSoLuong = heSoLuong;
	}
	public void input() {
		System.out.print("Họ tên:");
		String tenGD = sc.nextLine();
		this.hoTen = tenGD;
		
		System.out.print("Năm sinh:");
		int ns = Integer.parseInt(sc.nextLine());
		this.namSinh = ns;
		
		System.out.print("Hệ số lương:");
		double hsl = Double.parseDouble(sc.nextLine());
		this.heSoLuong = hsl;
	}
}
