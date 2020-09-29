package lesson04_exercises;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class People {
	public String name;
	public int birthday;
	public int coefficientsSalary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public int getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(int coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	public People() {
	}

	public People(String name, int birthday, float coeficientsSalary) {
		this.name = name;
		this.birthday = birthday;
		this.coefficientsSalary=coefficientsSalary;
	}

	public void Input()

	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Họ và tên:");
		name = sc.next();
		System.out.println(" Năm Sinh:");
		birthday = sc.nextInt();
		System.out.println("Hệ số lương:");
		coefficientsSalary = sc.nextInt();
	}


}
