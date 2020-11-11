package ex01;

public class Student {
	  
    enum Loai {
        A, B, C, D,E,F;
    }
    String maSV;
    String tenSV;
    Loai xepLoai;
   
    public Student(String maSV, String tenSV, Loai xepLoai) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.xepLoai = xepLoai;
    }

    public Student() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public Loai getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(Loai xepLoai) {
        this.xepLoai = xepLoai;
    }
	
}
