package ex04;

import java.util.Scanner;

public class Manager extends People {
	private int hs;
	private int amount;
	static Scanner sc=new Scanner(System.in);
	public Manager(){
		
	}
	public Manager(int hs,int amount) {
		super();
		this.hs=hs;
		this.amount=amount;
	}
	public int getHs() {
		return hs;
	}
	public void setHs(int hs) {
		this.hs = hs;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public void input() {
		super.input();
		System.out.print("hệ số lương: ");
		this.hs=sc.nextInt();
		System.out.print("Số lượng nhân viên quản lý:");
		this.amount=sc.nextInt();
	}
	@Override
	public double calSalary() {
		this.salary=this.hs*2200000;
		 return this.salary;
	}
	@Override
	public String toString() {
		return super.toString()+
				"Hệ số lương:"+this.hs+"\n"+
				"Số lượng nhân viên quản lý:"+this.amount+"\n"+
				"Lương: "+this.calSalary();
	}
}
