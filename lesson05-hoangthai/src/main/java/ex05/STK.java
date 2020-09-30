package ex05;

import java.util.Scanner;

public class STK extends SACH{

	public STK(int id, String NXB, int price) {
		super(id, NXB, price);
		// TODO Auto-generated constructor stub
	}
	private int tax;
	@Override
	public String toString() {
		return "STK [tax=" + tax + "]";
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		super.nhap();
		System.out.println("Nhập tình trạng: ");
		tax=sc.nextInt();
	}
}
