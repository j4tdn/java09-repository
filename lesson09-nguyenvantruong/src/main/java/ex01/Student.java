package ex01;

public class Student {

	private int mssv;
	private String tensv;
	private String Lop;
	
	
	
	
	public Student(int mssv, String tensv, String lop) {
		super();
		this.mssv = mssv;
		this.tensv = tensv;
		Lop = lop;
	}
	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
	public String getTensv() {
		return tensv;
	}
	public void setTensv(String tensv) {
		this.tensv = tensv;
	}
	public String getLop() {
		return Lop;
	}
	public void setLop(String lop) {
		Lop = lop;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return mssv+"-"+tensv+"-"+Lop;
	}
	

}
