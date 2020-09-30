package Bai5;

import java.util.Scanner;

public class Sach {
	private String maSach;
	private double donGia;
	private String nhaXuatBan;
	Scanner ip = new Scanner(System.in);
	public Sach() {
		// TODO Auto-generated constructor stub
	}
	
	public Sach(String maSach, double donGia, String nhaXuatBan) {
		super();
		this.maSach = maSach;
		this.donGia = donGia;
		this.nhaXuatBan = nhaXuatBan;
	}
	

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public void nhapSach() {
		System.out.println("nhap Ma Sach :");
		maSach = ip.nextLine();
		System.out.println("Nhap Don Gia :");
		donGia = ip.nextDouble();
		System.out.println("Nhap Nha Xuat Ban :");
		nhaXuatBan = ip.nextLine();
	}

	 @Override
	    public String toString() {
	        return "Mã sách: " + this.maSach + ", tên nhà xuất bản: " + this.nhaXuatBan + ", đơn giá: " + 
	                this.donGia ;
	    }

	
	
}
