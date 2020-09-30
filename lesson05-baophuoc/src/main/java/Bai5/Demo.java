package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		ArrayList<SachGK> arrSachGiaoKhoa = new ArrayList<>();
		ArrayList<SachTK> arrSachThamKhao = new ArrayList<>();
		ArrayList<String> listString = new ArrayList<String>();
		int soSachGiaoKhoa, soSachThamKhao;
		double tongsoSachGK = 0, tongsoSachTK = 0, tong;
		tong =tongsoSachGK+tongsoSachTK;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số sách giáo khoa: ");
		soSachGiaoKhoa = scanner.nextInt();
		System.out.print("Nhập số sách tham khảo: ");
		soSachThamKhao = scanner.nextInt();

		System.out.println("Nhập thông tin sách giáo khoa:");
		for (int i = 0; i < soSachGiaoKhoa; i++) {
			System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
			SachGK sachGiaoKhoa = new SachGK();
			sachGiaoKhoa.NhapThongTin();
			arrSachGiaoKhoa.add(sachGiaoKhoa);
		}

		System.out.println("Nhập thông tin sách tham khảo:");
		for (int i = 0; i < soSachThamKhao; i++) {
			System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
			SachTK sachThamKhao = new SachTK();
			sachThamKhao.NhapThongTin();
			arrSachThamKhao.add(sachThamKhao);

		}
		/*System.out.println("Cac Sach thuoc nha xuat ban nhi dong la: ");
		for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
			if (arrSachGiaoKhoa.get(i).getNXB() == "nhidong") {
				System.out.println(arrSachGiaoKhoa.get(i).toString());
		}
		for (int j = 0; i < arrSachThamKhao.size(); i++) {
			if (arrSachThamKhao.get(i).getNXB() == "nhidong") {
				System.out.println(arrSachThamKhao.get(i).toString());
		}*/
			
		System.out.println("-----Thông tin sách giáo khoa-----");
		for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
			System.out.println(arrSachGiaoKhoa.get(i).toString());
		}

		System.out.println("-----Thông tin sách tham khảo-----");
		for (int i = 0; i < arrSachThamKhao.size(); i++) {
			System.out.println(arrSachThamKhao.get(i).toString());
		}
	}
	}

