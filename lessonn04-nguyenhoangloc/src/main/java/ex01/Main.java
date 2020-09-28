
package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SinhVien sv1 = new SinhVien(1, "loc", 9, 8);
		SinhVien sv2 = new SinhVien(2, "thai", 3, 9);
		SinhVien sv3 = new SinhVien();
		sv3.nhap();
//		System.out.println("nhap id");
//		sv3.setId(scanner.nextInt());
//		scanner.nextLine();
//		System.out.println("nhap name");
//		sv3.setName(scanner.nextLine());
//
//		System.out.println("nhap deim LT");
//		sv3.setDiemLT(scanner.nextFloat());
//		System.out.println("nhap deim TH");
//		sv3.setDiemTH(scanner.nextFloat());
//		scanner.close();
		sv1.in();
		sv2.in();
		sv3.in();
	}
}
