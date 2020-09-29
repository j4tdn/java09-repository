package lesson04_exercises;

import java.util.Scanner;

public class Staff extends People {
private String unitName;
public Staff() {
}
public Staff(String unitName) {
	super();
	this.unitName = unitName;
}
public String getUnitName() {
	return unitName;
}
public void setUnitName(String unitName) {
	this.unitName = unitName;
}
public float Salary(float coefficientsSalary ) {
	return coefficientsSalary * 1250000;
}
public void InputStaff() {
	Scanner sc= new Scanner(System.in);
	System.out.print("Tên đơn vị :");
	this.unitName = sc.nextLine();
	
}
public void OutputStaff() {
	System.out.printf(" %20s %15s %15s %15s %15s\n","Họ tên","Năm sinh","Hệ số lương",
			"Tên Đơn Vị","Lương");
	System.out.printf(" %20s %15d %15.2d %15s %15.2f\n",name,birthday,coefficientsSalary,unitName,Salary(coefficientsSalary));
}
}
