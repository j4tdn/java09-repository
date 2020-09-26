package ex01;

public class Student {
	private int id;
	private String name;
	private Float theoreticalPoint;
	private Float practicePoint;

	public Student() {
	}

	public Student(int id, String name, Float theoreticalPoint, Float practicePoint) {
		this.id = id;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
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

	public Float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(Float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public Float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(Float practicePoint) {
		this.practicePoint = practicePoint;
	}

	public Float getMediumScore() {
		return (this.practicePoint + this.theoreticalPoint) / 2;
	}

	@Override
	public String toString() {
		return String.format("%-10s%-25s%-10.2f%-10.2f%-10.2f", this.id, this.name, this.practicePoint, this.theoreticalPoint,
				getMediumScore());
	}

}
