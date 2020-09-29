package ex04;

import java.util.Scanner;

public class Employee extends People {

	private Float coefficientPosition;

	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, Integer yearOfBirth, Float coefficientsSalary, String unitName, Scanner sc) {
		super(name, yearOfBirth, coefficientsSalary, unitName, sc);
		// TODO Auto-generated constructor stub
	}

	public Employee(Float coefficientPosition) {
		this.coefficientPosition = coefficientPosition;
	}

	public Float getCoefficientPosition() {
		return coefficientPosition;
	}

	public void setCoefficientPosition(Float coefficientPosition) {
		this.coefficientPosition = coefficientPosition;
	}
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		this.coefficientPosition = Float.parseFloat(sc.nextLine());
	}
	@Override
	public Float getSalary() {
		// TODO Auto-generated method stub
		return (this.coefficientPosition + this.coefficientsSalary) * 3000000;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "coefficientPosition=" + coefficientPosition + ", Salary: " + getSalary();
	}
	
}
