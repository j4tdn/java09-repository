package ex01;

public class Student {
	private int mssv;
	private String hovaten;
	private Type type;
	public Student(int mssv, String hovaten, Type type) {
		super();
		this.mssv = mssv;
		this.hovaten = hovaten;
		this.type = type;
	}
	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
	public String getHovaten() {
		return hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
}
