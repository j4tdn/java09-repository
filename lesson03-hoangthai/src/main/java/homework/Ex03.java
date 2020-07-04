package homework;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int chon;
		Vehicle[] v = new Vehicle[3];
		v[0] = new Vehicle();
		v[1] = new Vehicle();
		v[2] = new Vehicle();
		int game = 1;
		do {
			System.out.println("Chon thao tac: ");
			chon = Integer.parseInt(sn.nextLine());

			switch (chon) {
			case 1:
				for (int i = 0; i < 3; i++) {
					System.out.println("Nhap xe " + (i + 1));
					v[i].nhapXe();
				}
				break;
			case 2:
				System.out.println("Tenchuxe\t\tLoaixe\t\tDungtic\t\tTrigia\t\tThuephainop");
				for (int i = 0; i < 3; i++) {
					System.out.println(v[i].getChuXe() + "\t\t" + v[i].getLoaiXe() + "\t\t" + "\t\t" + v[i].getDungTic()
							+ "\t\t" + v[i].getTriGia() + "\t\t" + v[i].getThue());
				}
				break;
			case 3:
				game = 0;
				break;
			}
		} while (game == 1);
	}

}
