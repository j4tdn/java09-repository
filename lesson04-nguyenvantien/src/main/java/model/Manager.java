package model;

import java.util.Date;
import java.util.Scanner;

public class Manager extends People {
	private int numberOfEmp;
	
	public Manager() {
		super();
	}

	public Manager(String name, Date yearOfBrith, int salaryFactor, int numberOfEmp) {
		super(name, yearOfBrith, salaryFactor);
		this.numberOfEmp = numberOfEmp;
	}

	@Override
	public void inputInf() {
		Scanner scanner = new Scanner(System.in);
		super.inputInf();
		numberOfEmp = scanner.nextInt();
	}

	@Override
	public String toString() {
		return super.toString() + " - Số lượng nhân viên: " + numberOfEmp;
	}
	
	@Override
	public void countSalary() {
		System.out.println(this.getSalaryFactor() * 2500000);
	}

	public int getNumberOfEmp() {
		return numberOfEmp;
	}

	public void setNumberOfEmp(int numberOfEmp) {
		this.numberOfEmp = numberOfEmp;
	}
}
