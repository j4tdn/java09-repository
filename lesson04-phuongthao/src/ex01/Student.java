package ex01;

public class Student {
	int id;
	String name;
	float TH;
	float LT;
	
	public Student() {
		
	}
	public Student(int id, String name, float tH, float lT) {
		super();
		this.id = id;
		this.name = name;
		this.TH = tH;
		this.LT = lT;
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
	public float getTH() {
		return TH;
	}
	public void setTH(float tH) {
		TH = tH;
	}
	public float getLT() {
		return LT;
	}
	public void setLT(float lT) {
		LT = lT;
	}
	
	public float getGPA() {
		return (LT+TH)/2;
	}

	
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", TH=" + TH + ", LT=" + LT + ", GPA= "+  getGPA() + "]";
	}
	
		
}



