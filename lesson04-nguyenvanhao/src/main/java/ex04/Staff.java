package ex04;

import java.util.Scanner;

public class Staff extends People {
	private int hs;
	private String department;
	static Scanner sc=new Scanner(System.in);
	public Staff() {
		super();
	}
	public Staff(int hs, String department) {
		super();
		this.hs=hs;
		this.department=department;
	}
	public int getHs() {
		return hs;
	}
	public void setHs(int hs) {
		this.hs = hs;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public void input() {
		super.input();
		System.out.print("Hệ số:");
		this.hs=sc.nextInt();
		sc.nextLine();
		System.out.print("Phòng ban:");
		this.department=sc.nextLine();	
	}
	@Override
	public double calSalary() {
		 this.salary=this.hs*1250000;
		 return this.salary;
	}
	@Override
	public String toString() {
		return super.toString()+
				"Phòng ban   :"+this.department+"\n"+
				"Hệ số lương :"+this.hs+"\n"+
				"Lương       :"+this.calSalary();
	}
}
