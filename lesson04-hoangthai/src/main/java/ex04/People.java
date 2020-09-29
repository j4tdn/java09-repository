package ex04;

import java.util.Scanner;

public class People {
	private String name;
	private String yearOfBirth;
	private int coefficientsSalary;
	
	@Override
	public String toString() {
		return name+"  "+yearOfBirth+"   "+coefficientsSalary;
	}
	public People() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public int getCoefficientsSalary() {
		return coefficientsSalary;
	}
	public void setCoefficientsSalary(int coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ho ten");
		name = sc.nextLine();
		System.out.println("nhap nam sinh");
		yearOfBirth = sc.nextLine();
		System.out.println("nhap he so luong");
		coefficientsSalary = sc.nextInt();
	}
	
	public int Salary() {
		return Salary();
	}

}
