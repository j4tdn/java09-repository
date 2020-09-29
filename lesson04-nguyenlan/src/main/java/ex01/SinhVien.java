package ex01;

public class SinhVien {
	private int id;
	private String name;
	private float practicePoint;
	private float theoryPoint;
	
	public SinhVien() {
		id = 0;
		name = "";
		practicePoint = 0f;
		theoryPoint = 0f;
	}
	
	public SinhVien(int id, String name, float practicePoint, float theoryPoint) {
		this.id = id;
		this.name = name;
		this.practicePoint = practicePoint;
		this.theoryPoint = theoryPoint;
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
	
	public float calculateAveragePoint() {
		return (practicePoint + theoryPoint) / 2;
	}
	
	@Override
	public String toString() {
		
		return "id: " + id 
				+ ",	name: " + name 
				+ ",	practice point: " + practicePoint
				+ ",	theory point: " + theoryPoint;
	}
	
}
