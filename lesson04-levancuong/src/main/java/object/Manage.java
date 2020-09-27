package object;

import java.util.Scanner;

public class Manage extends People{
	private int numberOfEmployee;
	public Manage(String name, int yearOfBirth, float coefficientSalary,int numberOfEmployee) {
		super(name, yearOfBirth, coefficientSalary);
		this.numberOfEmployee=numberOfEmployee;
	}
	public Manage() {
		
	}
	@Override
	public float caculateSalary() {
		return this.coefficientSalary*2200000;
	}
	@Override
	public String toString() {
		return String.format("%-30s%-20d%-25d%-25.2f%-25.2f", this.name,this.yearOfBirth,this.numberOfEmployee,this.coefficientSalary,this.caculateSalary());
	}
	static Scanner sc=new Scanner(System.in);
	
	@Override
	public void input() {
		super.input();
		System.out.print("Enter number of employee:");
		this.numberOfEmployee=Integer.parseInt(sc.nextLine());
		
	}

}
