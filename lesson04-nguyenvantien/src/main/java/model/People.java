package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class People {
	private String name;
	private Date yearOfBrith;
	private int salaryFactor;
	
	public People() {
		
	}

	public People(String name, Date yearOfBrith, int salaryFactor) {
		this.name = name;
		this.yearOfBrith = yearOfBrith;
		this.salaryFactor = salaryFactor;
	}

	public void inputInf() {
		Scanner scanner = new Scanner(System.in);
		this.name = scanner.nextLine();
		String date = scanner.nextLine();
		yearOfBrith = new Date(date);
		salaryFactor = scanner.nextInt();
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return "Tên: " + name + " - Năm sinh: " + dateFormat.format(yearOfBrith) + " - Hệ số lương: " + salaryFactor;
	}
	
	public void countSalary() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getYearOfBrith() {
		return yearOfBrith;
	}

	public void setYearOfBrith(Date yearOfBrith) {
		this.yearOfBrith = yearOfBrith;
	}

	public int getSalaryFactor() {
		return salaryFactor;
	}

	public void setSalaryFactor(int salaryFactor) {
		this.salaryFactor = salaryFactor;
	}

}
