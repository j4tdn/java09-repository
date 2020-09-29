package ex04;

import java.util.Scanner;

public class Manager extends People {
	private int positionCoefficient;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "   " + positionCoefficient;
	}

	public int getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(int positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);

		super.nhap();
		System.out.println("nhap he so chuc vu");
		positionCoefficient=sc.nextInt();

	}
	@Override
	public int Salary() {
		return (this.getCoefficientsSalary()+positionCoefficient)*3000000;
	}

}
