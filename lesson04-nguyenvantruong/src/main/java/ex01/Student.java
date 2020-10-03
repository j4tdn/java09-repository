package ex01;

public class Student {
	private int masv;
	private String name;
	private Float theoreticalPoint;
	private Float mathPoint;

	public Student() {

	}

	public Student(int masv, String name, Float theoreticalPoint, Float mathPoint) {

		this.masv = masv;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.mathPoint = mathPoint;
	}

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(Float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public Float getMathPoint() {
		return mathPoint;
	}

	public void setMathPoint(Float mathPoint) {
		this.mathPoint = mathPoint;
	}

	public Float getmediumScore() {
		return (this.getMathPoint() + this.theoreticalPoint) / 2;
	}

	@Override
	public String toString() {
		return String.format("%-10s%-25s%-10.2f%-10.2f%-10.2f", this.masv, this.name, this.theoreticalPoint,
				this.mathPoint, getmediumScore());
	}

}
