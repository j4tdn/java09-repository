package Bai5;

import java.util.Scanner;

public class KhachHang {
	public String MaKH;
	public String HoTen;
	public String Phone;
	public String DiaChi;
	Scanner scanner= new Scanner(System.in);
	
	public KhachHang() {
		
	}
	
	public KhachHang(String MaKH, String HoTen, String Phone, String Diachi) {
		this.MaKH=MaKH;
		this.HoTen=HoTen;
		this.Phone=Phone;
		this.DiaChi=DiaChi;
	}

	public String getMaKH() {
		return MaKH;
	}

	public void setMaKH(String maKH) {
		MaKH = maKH;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public void NhapKH() {
		System.out.println("Nhap Ma KH: ");
		MaKH=scanner.nextLine();
		System.out.println("Nhap ten KH: ");
		HoTen=scanner.nextLine();
		System.out.println("Nhap SDT:");
		Phone=scanner.nextLine();
		System.out.println("Nhap Dia Chi:");
		DiaChi=scanner.nextLine();
	}

	@Override
	public String toString() {
		return "KhachHang [MaKH=" + MaKH + ", HoTen=" + HoTen + ", Phone=" + Phone + ", DiaChi=" + DiaChi + "]";
	}
	

}
