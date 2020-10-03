package ex04;

import java.util.Scanner;

public class Manager extends People {
	private Integer numberOfEmployee;

	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, Integer yearOfBirth, Float coefficientsSalary, String unitName, Scanner sc) {
		super(name, yearOfBirth, coefficientsSalary, unitName, sc);
	}

	public Manager(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	public void input() {
		super.input();
		System.out.println("Nhập số lượng nhân viên: ");
		this.numberOfEmployee = Integer.parseInt(sc.nextLine());
	}
	@Override
	public Float getSalary() {
		// TODO Auto-generated method stub
		return (this.coefficientsSalary) * 2200000;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " numberOfEmployee=" + numberOfEmployee + ", Salary: "+ getSalary();
	}
}
