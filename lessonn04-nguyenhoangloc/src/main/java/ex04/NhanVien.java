package ex04;

import java.util.Scanner;

public class NhanVien extends People {
	private String tenPhongBan;
	
	@Override
	public String toString() {
		return super.toString()+"ten phong ban:"+tenPhongBan;
		
	}
	public String getTenPhongBan() {
		return tenPhongBan;
	}


	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}
	
	@Override
	public double tinhLuong() {
		return getHeSoLuong() * 1250000;

	}
	@Override
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap thong tin cua nhan vien");
		super.nhap();
		System.out.println("ten phong ban");
		tenPhongBan = scanner.nextLine();
	}

	
}
