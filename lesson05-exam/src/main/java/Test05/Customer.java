package Test05;

import java.util.Scanner;

public class Customer {
	private String id;
	private String name;
	private int phone;
	private String address;
	public Customer() {
		
	}
	public Customer(String id,String name,int phone,String address ) {
		this.id=id;
		this.address=address;
		this.name=name;
		this.phone=phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Mã khách hàng  :"+this.id+"\n"
				+"Tên          :"+this.name+"\n"
				+"Số điện thoại:"+this.phone+"\n"
				+"Địa chỉ      :"+this.address;
	}
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập thông tin khách hàng!!!");
		System.out.print("Mã khác hàng:");
		this.id=sc.nextLine();
		System.out.print("Tên:");
		this.name=sc.nextLine();
		System.out.print("Số điện thoại:");
		this.phone=sc.nextInt();
		System.out.print("Địa chỉ:");
		this.address=sc.nextLine();
	}
	
}
