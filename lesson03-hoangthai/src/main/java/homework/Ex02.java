package homework;

import java.util.Scanner;

public class Ex02 {
	private String chuxe;
	private String loaixe;
	private int dungtic;
	private double trigia;
	private double thue;

	public String getChuXe() {
		return chuxe;
	}

	public void setChuXe(String chuxe) {
		this.chuxe = chuxe;
	}

	public String getLoaiXe() {
		return loaixe;
	}

	public void setLoaiXe(String loaixe) {
		this.loaixe = loaixe;
	}

	public int getDungTic() {
		return dungtic;
	}

	public void setDungTic(int dungtic) {
		this.dungtic = dungtic;
	}

	public double getTriGia() {
		return trigia;
	}

	public void setTriGia(double trigia) {
		this.trigia = trigia;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	public void nhapXe() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Ten chu xe: ");
		chuxe = sn.nextLine();
		System.out.println("Loai xe: ");
		loaixe = sn.nextLine();
		System.out.println("Dung tic: ");
		dungtic = Integer.parseInt(sn.nextLine());
		System.out.println("Nhap tri gia: ");
		trigia = Double.parseDouble(sn.nextLine());
		tinhThue();
	}

	public void tinhThue() {
		if (dungtic < 100) {
			thue = trigia / 100;
		} else if (dungtic >= 100 && dungtic <= 200) {
			thue = (trigia / 100) * 3;
		} else {
			thue = (trigia / 100) * 5;
		}
	}
}