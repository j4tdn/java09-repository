package exercise04;

import java.text.DateFormat;
import java.util.Scanner;

public abstract class People {
	public static Scanner scanner = new Scanner(System.in);

	String name;
	int birthday;
	float coesalary;

	public People() {
		// TODO Auto-generated constructor stub
	}

	public People(String name, int birthday, float coesalary) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.coesalary = coesalary;
	}

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

	public float getCoesalary() {
		return coesalary;
	}

	public void setCoesalary(float coesalary) {
		this.coesalary = coesalary;
	}

	public void nhap() {
		// System.out.println("Nhập thông tin:");
		System.out.println("Họ và tên: ");
		this.name = scanner.nextLine();
		System.out.println("nhập năm sinh: ");
		this.birthday = scanner.nextInt();
		System.out.println("Nhập hệ số lương: ");
		this.coesalary = scanner.nextFloat();

	}

	@Override
	public String toString() {
		return this.name + "		" + this.birthday + "		" + this.coesalary;
	}

}
