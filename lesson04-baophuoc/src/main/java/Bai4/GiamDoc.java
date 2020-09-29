package Bai4;

public class GiamDoc extends People {

	private float hesochucvu;

	public GiamDoc() {
		super();
	}

	public GiamDoc(float hesochucvu) {
		super();
		this.hesochucvu = hesochucvu;

	}

	public float getHesochucvu() {
		return hesochucvu;
	}

	public void setHesochucvu(float hesochucvu) {
		this.hesochucvu = hesochucvu;
	}

	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.print("Nhập hệ số chức vụ: ");
		hesochucvu = scanner.nextFloat();
	}

	@Override
	public void tinhLuong() {
		luongNhanVien = (long) ((hesoluong + hesochucvu) * 3000000);

	}

	@Override
	public String toString() {
		return super.toString() + ", hệ số chức vụ: " + this.hesochucvu;
	}
}
