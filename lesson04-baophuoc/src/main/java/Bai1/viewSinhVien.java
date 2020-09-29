package Bai1;

import java.util.Scanner;

public class viewSinhVien {
	public static void main(String[] args) {
		 SinhVien sv1 = new SinhVien();
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập Mã SV 1: ");
	        sv1.setMaSV(sc.nextInt());sc.nextLine();
	        System.out.print("Nhập tên SV 1: ");
	        sv1.setTenSV(sc.nextLine());
	        System.out.print("Nhập điểm lý thuyết: ");
	        sv1.setDiemLT(sc.nextFloat());
	        System.out.print("Nhập điểm thực hành: ");
	        sv1.setDiemTH(sc.nextFloat());
	        sv1.Average();
	        
	        /*SinhVien sv2 = new SinhVien();
	        System.out.print("Nhập Mã SV 2: ");
	        sv2.setMaSV(sc.nextInt());sc.nextLine();
	        System.out.print("Nhập tên SV 2: ");
	        sv2.setTenSV(sc.nextLine());
	        System.out.print("Nhập điểm lý thuyết: ");
	        sv2.setDiemLT(sc.nextFloat());
	        System.out.print("Nhập điểm thực hành: ");
	        sv2.setDiemTH(sc.nextFloat());
	        sv2.Average();
	        
	        SinhVien sv3 = new SinhVien();
	        System.out.print("Nhập Mã SV 3: ");
	        sv3.setMaSV(sc.nextInt());sc.nextLine();
	        System.out.print("Nhập tên SV 3: ");
	        sv3.setTenSV(sc.nextLine());
	        System.out.print("Nhập điểm lý thuyết: ");
	        sv3.setDiemLT(sc.nextFloat());
	        System.out.print("Nhập điểm thực hành: ");
	        sv3.setDiemTH(sc.nextFloat());
	        sv3.Average();*/
	        
	        System.out.print("Mã sinh viên    "+"Họ tên     "+"Điểm lý thuyết    "+"Điểm thực hành    "+"Điểm trung bình");
	        sv1.inSV();
	        //sv2.inSV();
	        //sv3.inSV();
	}
}
