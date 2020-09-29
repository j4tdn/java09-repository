package bai1;

import java.util.Scanner;

public class SinhvienDemo {
	public static void main(String[] args) {
		Sinhvien sv1 = new Sinhvien(102,"Nguyễn Hoàng Sang", (float) 8.2, (float) 9);
		Sinhvien sv2 = new Sinhvien(104,"Nguyễn Thanh Quân", (float) 7.3, (float) 9.2);
		Sinhvien sv3 = new Sinhvien();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi nhap MSV:");
		int msv = Integer.parseInt(sc.nextLine());
		
		System.out.print("Moi nhap ten sinh vien:");
		String name = sc.nextLine();
		
		System.out.print("Moi nhap diem LT :");
		float diemLT = Float.parseFloat(sc.nextLine());
		
		System.out.print("Moi nhap diem LT :");
		float diemTH = Float.parseFloat(sc.nextLine());
		
		sv3.setMsv(msv);
		sv3.setHoten(name);
		sv3.setDiemLT(diemLT);
		sv3.setDiemTH(diemTH);
		
		System.out.printf("%-10s %-20s %-10s %-10s %-10s\n","MSSV","Họ tên","Điểm LT","Điểm TH","Điểm TB");
		sv1.toString1();
		sv2.toString1();
		sv3.toString1();
	}
}
