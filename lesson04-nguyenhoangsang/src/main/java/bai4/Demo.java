package bai4;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		GiamDoc giamDoc = new GiamDoc();
		TruongPhong truongPhong = new TruongPhong();
		NhanVien nv1 = new NhanVien();
		NhanVien nv2 = new NhanVien();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập thông tin của giám đốc");
		giamDoc.input();
		giamDoc.inputGD();
		
		System.out.println("Nhập thông tin trưởng phòng");
		truongPhong.input();
		truongPhong.inputTP();
		
		System.out.println("Nhập thông tin nhân viên thứ nhất");
		nv1.input();
		nv1.inputNV();
		
		System.out.println("Nhập thông tin nhân viên thứ hai");
		nv2.input();
		nv2.inputNV();
		
		System.out.println("Thông tin giám đốc");
		giamDoc.outputGD();
		
		System.out.println("Thông tin trưởng phòng");
		truongPhong.outputTP();
		
		System.out.println("Thông tin nhân viên thứ nhất");
		nv1.outputNV();
		
		System.out.println("Thông tin nhân viên thứ hai");
		nv2.outputNV();
		
	}
}
