package beans;

public class Student {
	private String studentCode;
	private String firstAndLastName;
	private float theoreticalPoint;
	private float practicePoint;

	public Student() {
		this.studentCode = "";
		this.firstAndLastName = "";
		this.theoreticalPoint = (float) 0;
		this.practicePoint = (float) 0;
	}

	public Student(String studentCode, String firstAndLastName, float theoreticalPoint,
			float practicePoint) {
		this.studentCode = studentCode;
		this.firstAndLastName = firstAndLastName;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
	}
	
	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getFirstAndLastName() {
		return firstAndLastName;
	}

	public void setFirstAndLastName(String firstAndLastName) {
		this.firstAndLastName = firstAndLastName;
	}

	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(Float practicePoint) {
		this.practicePoint = practicePoint;
	}

	public String toString() {
		return this.toString();
	}
	
	public Float mediumScore() {
		return theoreticalPoint + practicePoint / 2;
	}
}
