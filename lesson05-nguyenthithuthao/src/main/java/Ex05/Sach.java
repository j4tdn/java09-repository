package Ex05;

import java.util.Scanner;

public class Sach {
	String idBook;
	float price;
	String tinhtrang;
	String NXS;
	float tax;
	String s1 = "Nhi Đồng";
	public static Scanner scanner = new Scanner(System.in);
	
	 public Sach() {
		// TODO Auto-generated constructor stub
	}
	public Sach(String idBook, float price, String tinhtrang, String nXS, float tax) {
		super();
		this.idBook = idBook;
		this.price = price;
		this.tinhtrang = tinhtrang;
		NXS = nXS;
		this.tax = tax;
	}
	public String getIdBook() {
		return idBook;
	}
	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getTinhtrang() {
		return tinhtrang;
	}
	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}
	public String getNXS() {
		return NXS;
	}
	public void setNXS(String nXS) {
		NXS = nXS;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public void nhap() {
		System.out.println("Nhập thông tin sách: ");
		System.out.println("Nhập mã sách:");
		idBook = scanner.nextLine();
		System.out.println("Nhập giá sách:");
		price = scanner.nextFloat();
		System.out.println("Nhập tình trạng sách:");
		tinhtrang = scanner.nextLine();
		System.out.println("Nhập nhà sản xuất: ");
		NXS = scanner.nextLine();
		System.out.println("Nhập thuế :");
		tax = scanner.nextFloat();
	}
	public void ktraNXS(String NSX , String idbook) {
		if (NXS.equalsIgnoreCase(s1)) {
			System.out.println(idbook);
			
		}
		
	}
	@Override
	public String toString() {
		return "Sach [idBook=" + idBook + ", price=" + price + ", tinhtrang=" + tinhtrang + ", NXS=" + NXS + ", tax="
				+ tax + "]";
	}
	 

}
