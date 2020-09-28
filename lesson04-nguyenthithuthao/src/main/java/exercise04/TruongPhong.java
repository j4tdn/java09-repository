package exercise04;

import javax.swing.plaf.SliderUI;

public class TruongPhong extends People {
	int soluongNV;
	public void nhap() {
		super.nhap();
		System.out.println("số lượng nhân viên quản lý: ");
		this.soluongNV = scanner.nextInt();
		
		
	}
	public TruongPhong() {
		// TODO Auto-generated constructor stub
	}
	public TruongPhong(String name, String birthday, float salary, int soluongNV) {
		super(name, birthday, salary);
		this.soluongNV = soluongNV;
	}
	public int getSoluongNV() {
		return soluongNV;
	}
	public void setSoluongNV(int soluongNV) {
		this.soluongNV = soluongNV;
	}
	public long luong() {
		return (long) coesalary *2200000;
	}
	@Override
	public String toString() {
		return this.name + "		" + this.coesalary + "	" + this.soluongNV + "	" + luong();
	}
	
	

}
