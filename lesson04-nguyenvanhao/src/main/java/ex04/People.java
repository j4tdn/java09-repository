package ex04;

import java.util.Scanner;

public class People {
	private String name;
	private int yearOfBirth;
	protected double salary;
	public static Scanner sc=new Scanner(System.in); 
	public People() {
		
	}
	public People(String name,int yearOfBirth,double salary) {
		this.name=name;
		this.yearOfBirth=yearOfBirth;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double calSalary() {
		return 0;
	}
	public void input() {
		sc.nextLine();
		System.out.print("Nhập tên nhân viên:");
		this.name=sc.nextLine();
		System.out.print("Năm sinh: ");
		this.yearOfBirth=sc.nextInt();
	}
	@Override
	public String toString() {
		return "Tên nhân viên: "+this.name+"\n"
				+"Năm Sinh   : "+this.yearOfBirth+"\n";
	}
}
