package bai1;

public class Sinhvien {
	private int Msv;
	private String Hoten;
	private float DiemLT,DiemTH;


	public Sinhvien(int msv, String hoten, float diemLT, float diemTH) {
		Msv = msv;
		Hoten = hoten;
		DiemLT = diemLT;
		DiemTH = diemTH;
	}

	public Sinhvien() {

	}

	public int getMsv() {
		return Msv;
	}

	public void setMsv(int msv) {
		Msv = msv;
	}

	public String getHoten() {
		return Hoten;
	}

	public void setHoten(String hoten) {
		Hoten = hoten;
	}

	public float getDiemLT() {
		return DiemLT;
	}

	public void setDiemLT(float diemLT) {
		DiemLT = diemLT;
	}

	public float getDiemTH() {
		return DiemTH;
	}

	public void setDiemTH(float diemTH) {
		DiemTH = diemTH;
	}
	public void toString1() {
		//System.out.println("%5$10d %4$20s %3$10f %2$10f %1$10f",Msv,Hoten,DiemLT,DiemTH,diemTB(DiemLT, DiemTH));
		System.out.printf("%-10d %-20s %-10.2f %-10.2f %-10.2f\n",Msv,Hoten,DiemLT,DiemTH,diemTB(DiemLT, DiemTH));

	}
	public float diemTB(float DiemLT,float DiemTH) {
		return (DiemLT + DiemTH)/2; 
	}
}
