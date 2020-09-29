package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		People people;
		int NhanVien;
		Scanner scanner = new Scanner(System.in);
		ArrayList<People> arrPeople = new ArrayList<>();

		System.out.println("NHẬP THÔNG TIN CỦA GIÁM ĐỐC: ");
		people = new GiamDoc();
		people.nhapThongTin();
		arrPeople.add(people);

		System.out.println("\nNHẬP THÔNG TIN CỦA TRƯỞNG PHÒNG: ");
		people = new TruongPhong();
		people.nhapThongTin();
		arrPeople.add(people);

		System.out.print("\nNHẬP SỐ NHÂN VIÊN CẦN ĐIỀN THÔNG TIN: ");
		NhanVien = scanner.nextInt();
		for (int i = 0; i < NhanVien; i++) {
			System.out.println("\nNhập thông tin nhân viên thứ " + (i + 1) + ": ");
			people = new NhanVien();
			people.nhapThongTin();
			arrPeople.add(people);

			System.out.println("THÔNG TIN NHÂN VIÊN");
			for (People p : arrPeople) {
				p.tinhLuong();
				System.out.println(p.toString());
			}
		}

	}
}