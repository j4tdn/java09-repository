package bt1;

public class Student {
	
	private int id;
	private String name;
	private float markTheory, markPrac;
	
	public Student() {
		this.id = 0;
		this.name = "";
		this.markTheory = 0;
		this.markPrac = 0;
	}
	
	public Student(int id, String name, float markTheory, float markPrac) {
		this.id = id;
		this.name = name;
		this.markTheory = markTheory;
		this.markPrac = markPrac;
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

	public float getMarkTheory() {
		return markTheory;
	}

	public void setMarkTheory(float markTheory) {
		this.markTheory = markTheory;
	}

	public float getMarkPrac() {
		return markPrac;
	}

	public void setMarkPrac(float markPrac) {
		this.markPrac = markPrac;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", markTheory=" + markTheory + ", markPrac=" + markPrac + "]";
	}
	
	public float getMarkAver() {
		return (this.markTheory + this.markPrac)/2;
	}
	
}
