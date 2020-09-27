package entities;

public class Student {
	private int id;
	private String name;
	private float practicePoint;
	private float theoryPoint;
	
	public Student(int id, String name, float practicePoint, float theoryPoint) {
		this.id = id;
		this.name = name;
		this.practicePoint = practicePoint;
		this.theoryPoint = theoryPoint;
	}
	
	public Student() {
		id = -1;
		name = "";
		practicePoint = -1f;
		theoryPoint = -1f;
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

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}

	public float getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}
	
	public float getAveragePoint() {
		return (practicePoint + theoryPoint) / 2;
	}
	
	@Override
	public String toString() {
		return "id: " + id 
				+ ", name: " + name 
				+ ", practice point: " + practicePoint
				+ ", theory point: " + theoryPoint;
	}
	
	public String toFormatedString() {
		return String.format("%-15d%-20s%-15.2f%-20.2f", this.id, this.name, this.practicePoint, this.theoryPoint);
	}
}
