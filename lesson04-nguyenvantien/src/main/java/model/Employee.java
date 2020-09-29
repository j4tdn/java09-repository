package model;

import java.util.Date;
import java.util.Scanner;

public class Employee extends People {

	private String department;

	public Employee() {
		super();
	}

	public Employee(String name, Date yearOfBrith, int salaryFactor, String department) {
		super(name, yearOfBrith, salaryFactor);
		this.department = department;
	}

	@Override
	public void inputInf() {
		Scanner scanner = new Scanner(System.in);
		super.inputInf();
		department = scanner.nextLine();
	}

	@Override
	public String toString() {
		return super.toString() + " - Bộ phận: " + department;
	}

	@Override
	public void countSalary() {
		System.out.println(this.getSalaryFactor() * 3000000);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
