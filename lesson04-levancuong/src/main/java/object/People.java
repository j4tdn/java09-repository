package object;

import java.util.Scanner;

public abstract class People {
	protected String name;
	protected int yearOfBirth;
	protected float coefficientSalary;
	
	
	public People() {
		
	}
	
	
	
	public People(String name, int yearOfBirth, float coefficientSalary) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.coefficientSalary = coefficientSalary;
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



	public float getCoefficientSalary() {
		return coefficientSalary;
	}



	public void setCoefficientSalary(float coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}



	abstract public float caculateSalary();
	static Scanner sc=new Scanner(System.in);
	public void input() {
		System.out.print("Enter name:");
		this.name=sc.nextLine();
		System.out.print("Enter year of birth:");
		this.yearOfBirth=Integer.parseInt(sc.nextLine());
		System.out.print("Enter coefficient salary:");
		this.coefficientSalary=Float.parseFloat(sc.nextLine());
	}
	@Override
	public String toString() {
		return String.format("%-30s%-5d%-5.2f", this.name,this.yearOfBirth,this.coefficientSalary);
	}
}
