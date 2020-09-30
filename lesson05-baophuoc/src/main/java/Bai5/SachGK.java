package Bai5;

public class SachGK extends Sach {
	private String tinhtrang;
	private int number;

	public SachGK() {
		super();
	}

	public SachGK(String tinhtrang) {
		super.NhapThongTin();
		;
		this.tinhtrang = tinhtrang;
		this.number = number;
	}

	public String getTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String tinhTrangSach(int x) {
		switch (number) {
		case 0:
			tinhtrang = "cũ";
			break;
		case 1:
			tinhtrang = "mới";
			break;
		default:
			break;
		}
		return tinhtrang;
	}

	public void NhapThongTin() {
		super.NhapThongTin();
		System.out.print("Nhập tình trạng sách (0 - cũ/ 1 - mới): ");
		number = scanner.nextInt();
	}

	public String toString() {
		return super.toString() + ", tình trạng sách: " + this.tinhTrangSach(number);
	}

}
