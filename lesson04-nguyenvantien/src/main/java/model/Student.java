package model;

public class Student {
	private int id;
	private String name;
	private float theoMark;
	private float pracMark;

	public Student() {

	}

	public Student(int id, String name, float theoMark, float pracMark) {
		this.id = id;
		this.name = name;
		this.theoMark = theoMark;
		this.pracMark = pracMark;
	}

	public float averageScore() {
		return (this.theoMark + this.pracMark) / 2;
	}

	@Override
	public String toString() {
		return "Mã sinh viên: " + id + " - Họ và tên: " + name + " - Điểm LT: " + theoMark + " - Điểm TH: " + pracMark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTheoMark() {
		return theoMark;
	}

	public void setTheoMark(float theoMark) {
		this.theoMark = theoMark;
	}

	public float getPracMark() {
		return pracMark;
	}

	public void setPracMark(float pracMark) {
		this.pracMark = pracMark;
	}

}
