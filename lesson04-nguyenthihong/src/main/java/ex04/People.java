package ex04;

import java.util.Scanner;

public class People {
	protected String name;
	protected Integer yearOfBirth;
	protected Float coefficientsSalary;
	protected Scanner sc = new Scanner(System.in);

	public People() {
	}

	public People(String name, Integer yearOfBirth, Float coefficientsSalary, Scanner sc) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.coefficientsSalary = coefficientsSalary;

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

	public void input() {
		System.out.println("Nhập tên: ");
		name = sc.nextLine();
		System.out.println("Nhập năm sinh: ");
		yearOfBirth = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập hệ số lương: ");
		coefficientsSalary = Float.parseFloat(sc.nextLine());
	}

	public Float getSalary() {
		return null;
	}

	@Override
	public String toString() {
		return getName() + "name=" + name + ", yearOfBirth=" + yearOfBirth + ", coefficientsSalary="
				+ coefficientsSalary ;
	}

}
