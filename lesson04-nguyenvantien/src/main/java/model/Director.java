package model;

import java.util.Date;
import java.util.Scanner;

public class Director extends People {

	private float positonFactor;

	public Director() {
		super();
	}

	public Director(String name, Date yearOfBrith, int salaryFactor, float positonFactor) {
		super(name, yearOfBrith, salaryFactor);
		this.positonFactor = positonFactor;
	}

	@Override
	public void inputInf() {
		super.inputInf();
		Scanner scanner = new Scanner(System.in);
		positonFactor = scanner.nextFloat();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " - Hệ số chức vụ: " + positonFactor;
	}

	@Override
	public void countSalary() {
		System.out.println((this.getSalaryFactor() + this.getPositonFactor()) * 1250000);
	}

	public float getPositonFactor() {
		return positonFactor;
	}

	public void setPositonFactor(float positonFactor) {
		this.positonFactor = positonFactor;
	}

}
