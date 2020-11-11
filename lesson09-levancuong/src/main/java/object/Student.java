package object;

public class Student {
	private String id;
	private String name;
	private Classification classification;

	public Student() {

	}

	public Student(String id, String name, Classification classification) {
		this.id = id;
		this.name = name;
		this.classification = classification;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
	}

	public Classification getClassification() {
		return classification;
	}
	

	public void setClassification(Classification classification) {
		this.classification = classification;
	}
	@Override
	public String toString() {
		return this.id+"-"+this.name+"-"+this.classification;
	}
}
