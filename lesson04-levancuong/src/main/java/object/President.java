package object;

import java.util.Scanner;

public class President extends People{
	private float coefficientPosition;
	
	public President() {
		
	}
	
	public President(String name, int yearOfBirth, float coefficientSalary,float coefficientPosition) {
		super(name, yearOfBirth, coefficientSalary);
		this.coefficientPosition=coefficientPosition;
	}

	@Override
	public float caculateSalary() {
		return (this.coefficientPosition+this.coefficientSalary)*3000000;
	}
	@Override
	public String toString() {
		return String.format("%-30s%-20d%-25.2f%-25.2f%-25.2f", this.name,this.yearOfBirth,this.coefficientSalary,this.coefficientPosition,this.caculateSalary());
	}
	static Scanner sc=new Scanner(System.in);
	@Override
	public void input() {
		super.input();
		System.out.print("Enter coefficient position:");
		this.coefficientPosition=Float.parseFloat(sc.nextLine());
	}

}
