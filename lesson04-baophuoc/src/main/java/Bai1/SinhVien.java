package Bai1;

public class SinhVien {
	private int maSV;
	private String tenSV;
	private float diemLT;
	private float diemTH;

	public SinhVien() {

	}

	public SinhVien(int maSV, String tenSV, float diemLT, float diemTH) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}

	// ham tinh diem trung binh
	public float Average() {
		return (diemTH + diemLT) / 2;
	}

	public void inSV() {
		System.out.println("\n" + maSV + "               " + tenSV + "             " + diemLT + "             " + diemTH + "            " + Average());
	}
}
