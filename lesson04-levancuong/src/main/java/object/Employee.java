package object;

import java.util.Scanner;

public class Employee extends People{
	private String unitName;
	
	public Employee() {
		
	}
	
	@Override
	public float caculateSalary() {
		return this.coefficientSalary*1250000;
	}

	public Employee(String name, int yearOfBirth, float coefficientSalary,String unitName) {
		super(name, yearOfBirth, coefficientSalary);
		this.unitName=unitName;
	}
	static Scanner sc=new Scanner(System.in);
	@Override
	public void input() {
		super.input();
		System.out.print("Enter name unit:");
		this.unitName=sc.nextLine();
		
	}
	@Override
	public String toString() {
		return  String.format("%-30s%-20d%-25s%-25.2f%-25.2f",this.name,this.yearOfBirth,this.unitName,this.coefficientSalary,this.caculateSalary());
	}
	
	
}
