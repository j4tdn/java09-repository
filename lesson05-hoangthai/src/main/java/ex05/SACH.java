package ex05;

import java.util.Scanner;

public class SACH {
	private int id;
	private String NXB;
	private int price;
	
	public SACH(int id, String NXB, int price) {
		this.id = id;
		this.NXB = NXB;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNXB() {
		return NXB;
	}

	public void setNXB(String nXB) {
		NXB = nXB;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "STK [id=" + id + ", NXB=" + NXB + ", price=" + price + "]";
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhập mã sách: ");
		id = sc.nextInt();
		System.out.println(" nhập NXB: ");
		NXB = sc.nextLine();
		System.out.println(" nhập đơn giá: ");
		price = sc.nextInt();
	}
}
