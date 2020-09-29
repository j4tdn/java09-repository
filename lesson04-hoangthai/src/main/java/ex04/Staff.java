package ex04;

import java.util.Scanner;

public class Staff extends People {
	private String unitName;

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "   " + unitName;

	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	@Override
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		super.nhap();
		System.out.println("nhap phong ban");
		unitName=sc.nextLine();
	}
	@Override
	public int Salary() {
		return getCoefficientsSalary()*12500000;
	}
}
