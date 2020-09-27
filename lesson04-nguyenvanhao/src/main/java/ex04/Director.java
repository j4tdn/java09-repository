package ex04;

import java.util.Scanner;

public class Director extends People {
	private int hs;
	private int  hsc;
	static Scanner sc=new Scanner(System.in);
	public Director() {
		
	}
	public Director(int hs,int hsc) {
		super();
		this.hs=hs;
		this.hsc=hsc;
	}
	public int getHs() {
		return hs;
	}
	public void setHs(int hs) {
		this.hs = hs;
	}
	public int getHsc() {
		return hsc;
	}
	public void setHsc(int hsc) {
		this.hsc = hsc;
	}
	@Override
	public void input() {
		super.input();
		System.out.print("Hệ số lương");
		this.hs=sc.nextInt();
		sc.nextLine();
		System.out.print("Hệ số chức vụ:");
		this.hsc=sc.nextInt();
	}
	@Override
	public double calSalary() {
		this.salary=(this.hs+this.hsc)*3000000;
		return this.salary;
	}
	@Override
	public String toString() {
		return super.toString()+"\n"
				+"Hệ số lương:"+this.hs+"\n"+
				"Hệ số chức vụ: "+this.hsc+"\n"
				+"Lương:"+this.calSalary();
	}
	
}
