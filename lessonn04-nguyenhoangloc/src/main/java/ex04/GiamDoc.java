package ex04;

import java.util.Scanner;

public class GiamDoc extends People {
	private int heSoChucVu;

	@Override
	public String toString() {
		return super.toString() +"he so chuc vu:"+ heSoChucVu;
	}

	public GiamDoc() {
		// TODO Auto-generated constructor stub
	}

	public GiamDoc(String hoten, int namSinh, double heSoLuong, int heSoChucVu) {
		super(hoten, namSinh, heSoLuong);
		this.heSoChucVu = heSoChucVu;
	}

	public int getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(int heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

	@Override
	public double tinhLuong() {
		return (getHeSoLuong() + heSoChucVu) * 3000000;

	}

	@Override
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap thong tin cua giam doc");
		super.nhap();
		System.out.println("nhap he so chuc vu");
		heSoChucVu = scanner.nextInt();

	}
}
