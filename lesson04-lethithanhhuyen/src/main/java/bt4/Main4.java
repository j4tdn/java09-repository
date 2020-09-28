package bt4;

import java.util.Scanner;

public class Main4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		GiamDoc gd = InputGD();
		TruongPhong tp = InputTP();
		NhanVien nv1 = InputNV();
		NhanVien nv2 = InputNV();
		System.out.println(""+ gd +"\tLương: " + gd.luong());
		System.out.println(""+tp + "\tLương: "+ tp.luong());
		System.out.println(""+nv1+"\tLương: "+nv1.luong());
		System.out.println(""+nv2+"\tLương: "+nv2.luong());
	}
	
	public static GiamDoc InputGD() {
		GiamDoc giamDoc = new GiamDoc() ;
		System.out.println("Giám đốc: ");
		sc.nextLine();
		System.out.printf("Họ tên: ");
		giamDoc.name = sc.nextLine();
		System.out.printf("Năm sinh: ");
		giamDoc.year = sc.nextInt();
		System.out.printf("Hệ số lương: ");
		giamDoc.setHsLuong(sc.nextFloat());
		System.out.printf("Hệ số chức vụ: ");
		giamDoc.setHsChucVu(sc.nextFloat());
		return giamDoc;
	}
	
	public static TruongPhong InputTP() {
		TruongPhong truongPhong = new TruongPhong();
		System.out.println("Trưởng phòng: ");
		sc.nextLine();
		System.out.printf("Họ tên: ");
		truongPhong.name = sc.nextLine();
		System.out.printf("Năm sinh: ");
		truongPhong.year = sc.nextInt();
		System.out.printf("Hệ số lương: ");
		truongPhong.setHsLuong(sc.nextFloat());
		System.out.println("Số lượng nhân viên: ");
		truongPhong.setSlnv(sc.nextInt());
		return truongPhong;
	}
	
	public static NhanVien InputNV() {
		NhanVien nhanVien = new NhanVien();
		System.out.println("Nhân viên:");
		sc.nextLine();
		System.out.printf("Họ tên: ");
		nhanVien.name = sc.nextLine();
		System.out.println("Năm sinh: ");
		nhanVien.year = sc.nextInt();
		System.out.println("Hệ số lương: ");
		nhanVien.setHsLuong(sc.nextFloat());
		sc.nextLine();
		System.out.println("Tên đơn vị: ");
		nhanVien.setTenDv(sc.nextLine());
		return nhanVien;
	}
}
