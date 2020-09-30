package Test05;

import java.util.Scanner;

public class Book {
	private String id;
	private double price;
	private String nxb;

	public Book() {

	}

	public Book(String id, double price, String nxb) {
		this.id = id;
		this.price = price;
		this.nxb = nxb;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}

	@Override
	public String toString() {
		return "Mã sách       :" + this.id + "\n" + "Đơn giá     :" + this.price + "\n" + "Nhà xuất bản:" + this.nxb;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin sách!!!");
		do {
			System.out.print("Mã sách :");
			this.id = sc.nextLine();
		} while (checkID(this.id));
		System.out.print("Đơn giá :");
		this.price = sc.nextDouble();
		System.out.print("Nhà xuất bản:");
		this.nxb = sc.nextLine();
	}

	public static boolean checkID(String s) {
		s.substring(0, 3);
		if (s.equals("SGK"))
			return true;
		return false;
	}
}
