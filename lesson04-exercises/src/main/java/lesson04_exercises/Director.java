package lesson04_exercises;

import java.util.Scanner;

public class Director extends People {
	private float position;

	public float getPosition() {
		return position;
	}

	public void setPosition(float position) {
		this.position = position;
	}

	public Director() {
	}

	public Director(float position) {
		super();
		this.position = position;
	}

	public float Salary(int  coefficientsSalary, float position ) {
		return (coefficientsSalary + position) * 3000000;
	}
	public void InputDirector() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Hệ số chức vụ :");
		this.position = Integer.parseInt(sc.nextLine());
		
	}
	public void OutputDirector() {
		System.out.printf(" %20s %15s %15s %15s %15s\n","Họ tên","Năm sinh","Hệ số lương","Hệ số chức vụ","Lương");
		System.out.printf(" %20s %15d %15d %15f %15.2f\n",name,birthday,coefficientsSalary,position,Salary(coefficientsSalary, position));
	}
}
