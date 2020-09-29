package lesson04_exercises;

import java.util.BitSet;
import java.util.Scanner;

public class Manager extends People {
private int numberOfManagementStaff;
public Manager() {
}
public Manager(int numberOfManagementStaff) {
	super();
	this.numberOfManagementStaff = numberOfManagementStaff;
}
public int getNumberOfManagementStaff() {
	return numberOfManagementStaff;
}
public void setNumberOfManagementStaff(int numberOfManagementStaff) {
	this.numberOfManagementStaff = numberOfManagementStaff;
}
public float Salary(float coefficientsSalary) {
	return coefficientsSalary * 2200000;
}
public void InputManager() {
	Scanner sc=new Scanner(System.in);
	System.out.print("Số lượng nhân viên quản lý :");
	this.numberOfManagementStaff = Integer.parseInt(sc.nextLine());
	
}
public void OutputManager() {
	System.out.printf(" %20s %15s %15s %15s %15s\n","Họ tên","Năm sinh","Hệ số lương","Số lượng nhân viên quản lý","Lương");
	System.out.printf(" %20s %15d %15d %15d %15.2f\n",name,birthday,coefficientsSalary,numberOfManagementStaff,Salary(numberOfManagementStaff));
	
}
}
