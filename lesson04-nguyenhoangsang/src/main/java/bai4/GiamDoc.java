package bai4;

import java.util.Scanner;

public class GiamDoc extends People {
	private int heSoChucVu;
	public GiamDoc() {
	}

	Scanner sc = new Scanner(System.in);
	public GiamDoc(int heSoChucVu) {
		super();
		this.heSoChucVu = heSoChucVu;
	}

	public int getHeSoChucVu() {
		return heSoChucVu;
	}
	public void setHeSoChucVu(int heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

	public double luong(double heSoLuong, int heSoChucVu) {
		return (heSoLuong + heSoChucVu) * 3000000;
	}
	public void inputGD() {
		System.out.print("Hệ số chức vụ :");
		int hs = Integer.parseInt(sc.nextLine());
		this.heSoChucVu = hs;
	}
	public void outputGD() {
		System.out.printf(" %-20s %-15s %-15s %-15s %-15s\n","Họ tên","Năm sinh","Hệ số lương","Hệ số chức vụ","Lương");
		System.out.printf(" %-20s %-15s %-15.2f %-15d %-15.2f\n",hoTen,namSinh,heSoLuong,heSoChucVu,luong(heSoLuong,heSoChucVu));
	}
}
