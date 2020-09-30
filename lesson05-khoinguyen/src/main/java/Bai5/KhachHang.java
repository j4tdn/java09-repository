package Bai5;

import java.util.Scanner;

public class KhachHang extends Sach{
	private String maKhachHang;
	private String hoVaTen;
	private int soDienThoai;
	private int diaChi;
	
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}

	public KhachHang(String maKhachHang, String hoVaTen, int soDienThoai, int diaChi) {
		super();
		this.maKhachHang = maKhachHang;
		this.hoVaTen = hoVaTen;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
	}

	public void NhapSach() {
		Scanner ip = new Scanner(System.in);
		System.out.println("nhap ma khach hang :");
		maKhachHang = ip.nextLine();
		System.out.println("Nhap ho va ten :");
		hoVaTen = ip.nextLine();
		System.out.println("Nhap so dien thoai :");
		soDienThoai = ip.nextInt();
		System.out.println("nhap dia chi :");
		diaChi = ip.nextInt();
	}
	
	
}
