package ex01;

import java.util.Scanner;

public class Students {
	private int id;
	private String name;
	private float diemLT, diemTH;

	public Students(int id, String name, float diemLT, float diemTH) {
		this.id = id;
		this.name = name;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public Students() {
		this.id = 0;
		this.name = " ";
		this.diemLT = 0;
		this.diemTH = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", diemLT=" + diemLT + ", diemTH=" + diemTH + "]";
	}

	public float diemTB() {
		float diemtb = (diemLT + diemTH) / 2;
		return diemtb;
	}

	public void nhap() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập id");
		setId(scanner.nextInt());
		
		scanner.nextLine();

		System.out.println("Nhập name");
		setName(scanner.nextLine());

		System.out.println("Nhập điểm LT");
		setDiemLT(scanner.nextFloat());

		System.out.println("Nhập điểm TH");
		setDiemTH(scanner.nextFloat());
		scanner.close();
	}

	public void in() {
		System.out.print("maSV      ");
		System.out.print("tenSV      ");
		System.out.print("diemLT      ");
		System.out.print("diemTH      ");
		System.out.println("diemTB      ");
		System.out.println(
				this.id + "   " + this.name + "   " + this.diemLT + "   " + this.diemTH + "   " + this.diemTB());
	}
}
