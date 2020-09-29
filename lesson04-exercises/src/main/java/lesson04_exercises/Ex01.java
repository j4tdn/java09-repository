package lesson04_exercises;

import java.util.Scanner;

public class Ex01 {
	private long id;
	private String name;
	private float point_LT;
	private float point_TH;

	public Ex01(long id, String name, float point_LT, float point_TH) {
		this.id = id;
		this.name = name;
		this.point_LT = point_LT;
		this.point_TH = point_TH;
	}

	public Ex01() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPoint_LT() {
		return point_LT;
	}

	public void setPoint_LT(float point_LT) {
		this.point_LT = point_LT;
	}

	public float getPoint_TH() {
		return point_TH;
	}

	public void setPoint_TH(float point_TH) {
		this.point_TH = point_TH;
	}

	public float MediumScore() {
		return (this.point_LT + this.point_TH) / 2;
	}

	public String toString() {
		return id + " - " + name + " diem Tb : " + MediumScore();
	}

	public void Output() {
		System.out.printf("%6d %16s %12f %13f %13f \n", id, name, point_LT, point_TH, MediumScore());
	}

	public static void main(String[] args) {
		Ex01 sv1 = new Ex01(1, "quoc", 8, 6);
		Ex01 sv2 = new Ex01(2, "Le b", 7, 9);
		Ex01 sv3 = new Ex01();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên 3: ");
		sv3.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập tên sinh viên 3: ");
		sv3.setName(sc.nextLine());
		System.out.println("Nhập điểm lý thuyết: ");
		sv3.setPoint_LT(sc.nextFloat());
		System.out.println("Nhập điểm thực hành: ");
		sv3.setPoint_TH(sc.nextFloat());
		System.out.printf("%10s %10s %20s %10s %10s \n", "Mã sinh viên", "Họ tên", "Điểm lý thuyết", "Điểm thực hành",
				"Điểm trung bình");
		sv1.Output();
		sv2.Output();
		sv3.Output();
	}
}
