package Bai5;

import java.util.Scanner;

public class Sach {
	private String MaSach;
	private double DonGia;
	private String NXB;
	Scanner scanner= new Scanner(System.in);
	
	
	public Sach() {
		
	}
	
	public Sach(String MaSach, double DonGia, String NXB) {
		this.MaSach=MaSach;
		this.DonGia=DonGia;
		this.NXB=NXB;
	}
	
	public String getMaSach() {
		return MaSach;
	}

	public void setMaSach(String maSach) {
		MaSach = maSach;
	}

	public double getDonGia() {
		return DonGia;
	}

	public void setDonGia(double donGia) {
		DonGia = donGia;
	}

	public String getNXB() {
		return NXB;
	}

	public void setNXB(String nXB) {
		NXB = nXB;
	}

	public void NhapThongTin() {
		System.out.println("Nhap Ma Sach: ");
		MaSach=scanner.nextLine();
		System.out.println("Nhap don Gia: ");
		DonGia=Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap NXB:");
		NXB=scanner.nextLine();
	}

	@Override
	public String toString() {
		return "Sach [MaSach=" + MaSach + ", DonGia=" + DonGia + ", NXB=" + NXB + "]";
	}

	
	
}
