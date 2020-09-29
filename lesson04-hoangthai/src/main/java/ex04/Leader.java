package ex04;

import java.util.Scanner;

public class Leader extends People{
	private int 
	numberOfManagementStaff;

	public Leader() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"  "+numberOfManagementStaff;
	}
	
	public int getNumberOfManagementStaff() {
		return numberOfManagementStaff;
	}

	public void setNumberOfManagementStaff(int numberOfManagementStaff) {
		this.numberOfManagementStaff = numberOfManagementStaff;
	}
	
	@Override
	public void nhap() {
		Scanner scanner=new Scanner(System.in);
		super.nhap();
		System.out.println("nhap so luong nhan vien quan ly");
		numberOfManagementStaff=scanner.nextInt();
	}
	@Override
	public int Salary() {
		return getCoefficientsSalary()*22000000;
	}
}
