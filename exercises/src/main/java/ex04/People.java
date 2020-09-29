package ex04;

import java.util.Scanner;

public class People {
	protected String name;
	protected Integer yearOfBirth;
	protected Float coefficientsSalary;
	protected String unitName;
	protected Scanner sc = new Scanner(System.in);
	
	
	
	public People() {
		// TODO Auto-generated constructor stub
	}


	public People(String name, Integer yearOfBirth, Float coefficientsSalary, String unitName, Scanner sc) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.coefficientsSalary = coefficientsSalary;
		this.unitName = unitName;
		this.sc = sc;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public Float getCoefficientsSalary() {
		return coefficientsSalary;
	}
	public void setCoefficientsSalary(Float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
	public void input() {
		System.out.println("nhap ten: ");
		name = sc.nextLine();
		System.out.println("Nhập năm sinh: ");
		yearOfBirth = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập hệ số lương: ");
		coefficientsSalary = Float.parseFloat(sc.nextLine());
	
	
	}
	@Override
	public String toString() {
		return getName() + "name=" + name + ", yearOfBirth=" + yearOfBirth + ", coefficientsSalary=";
	}
	
	public Float getSalary() {
		return null;
	}

}
