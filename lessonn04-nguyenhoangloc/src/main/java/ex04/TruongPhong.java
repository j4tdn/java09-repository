package ex04;

import java.util.Scanner;

public class TruongPhong extends People {
	private int soLuongNVQL;
	
	
	@Override
	public String toString() {
		return super.toString()+"so luong nhan vien quan ly:"+soLuongNVQL;
	}
	

	public int getSoLuongNVQL() {
		return soLuongNVQL;
	}

	public void setSoLuongNVQL(int soLuongNVQL) {
		this.soLuongNVQL = soLuongNVQL;
	}
	@Override
	public void nhap() {
		Scanner scannen=new Scanner(System.in);
		System.out.println("nhap thong tin truong phong");
		super.nhap();
		System.out.println("nhap vao so nhan vien quan ly");
		soLuongNVQL=scannen.nextInt();
	}
	@Override
	public double tinhLuong() {
		return getHeSoLuong()*2200000;
	}
}
