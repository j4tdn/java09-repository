package Bai1;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Student nhc = new Student(1,"Nguyen Hong Chanh", 5, 5);
		
		Student sv2 = new Student(2, "bo sua ", 6,6);
		
		Student sv3 = nhapSV3();
		
		System.out.println(nhc.toString());
		System.out.println(sv2.toString());
		System.out.println(sv3.toString());
		
		
	}
	
	public static Student nhapSV3() {
		
		Student sv3 = new Student();
		
		System.out.println("Moi nhap id");		
		sv3.setId(new Scanner(System.in).nextInt());
		
		System.out.println("Moi nhap ten :");
		sv3.setName(new Scanner(System.in).nextLine());
		
		System.out.println("Nhap diem LT");
		sv3.setDiemLT(new Scanner(System.in).nextFloat());
		
		System.out.println("Nhap diem TH: ");
		sv3.setDiemTH(new Scanner(System.in).nextFloat());
		
		
		
		
		return sv3;
		
		
	}
	
	
}
