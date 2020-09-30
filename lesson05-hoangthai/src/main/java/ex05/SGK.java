package ex05;

import java.util.Scanner;

public class SGK extends SACH {
	private String TT;
	public SGK(int id, String NXB, int price) {
		super(id, NXB, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SGK [TT=" + TT + "]";
	}
	public String getTT() {
		return TT;
	}
	public void setTT(String tT) {
		TT = tT;
	}
 
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		super.nhap();
		System.out.println("Nhập tình trạng: ");
		TT=sc.nextLine();
	}
	
	
}
