package ex04;

import java.util.Scanner;

public class People {
	private String hoten;
	private int namSinh;
	private double heSoLuong;

	@Override
	public String toString() {
		return "ho va ten:  " + hoten + "\n" 
				+ "nam sinh" + namSinh+"\n" 
				+ "he so luong" + heSoLuong+"\n"
				+ "LUONG" + tinhLuong()+"\n";
	}

	public People() {
		// TODO Auto-generated constructor stub
	}

	public People(String hoten, int namSinh, double heSoLuong) {
		this.hoten = hoten;
		this.namSinh = namSinh;
		this.heSoLuong = heSoLuong;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
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

	public void nhap() {
		Scanner sc = new Scanner(System.in);

		System.out.println("nhap ho ten");
		hoten = sc.nextLine();
		System.out.println("nhap nam sinh");
		namSinh = sc.nextInt();
		System.out.println("nhap he so luong");
		heSoLuong = sc.nextDouble();
	}

	public double tinhLuong() {

		return heSoLuong * 1250000;
	}
}
