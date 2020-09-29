package ex01;

import java.util.Scanner;

public class Ex01 extends SinhVien{
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		SinhVien s1 = new SinhVien(102180077, "Nguyễn Thị Lan", 8.1f, 8.5f);
		SinhVien s2 = new SinhVien(102180078, "Nguyễn Ngọc Lan", 8.5f, 9.0f);
		SinhVien s3 = new SinhVien();
		
		System.out.println("Nhập thông tin sinh viên 3: ");
		System.out.print("Nhập id: ");
		int id = ip.nextInt();
		ip.nextLine();
		System.out.print("Nhập họ và tên: ");
		String name = ip.nextLine();
		System.out.print("Nhập điểm thực hành: ");
		float practicePoint = ip.nextFloat();
		System.out.print("Nhập điểm lí thuyết: ");
		float theoryPoint = ip.nextFloat();
		
		s3.setId(id);
		s3.setName(name);
		s3.setTheoryPoint(theoryPoint);
		s3.setPracticePoint(practicePoint);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}
