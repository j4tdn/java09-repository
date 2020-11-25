package bean;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	
	public Student() {
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	@Override
	public String toString() {
		return id + ", " + name;
	}

	@Override
	public int compareTo(Student o) {
		return id - o.getId();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Student) {
			Student tmp = (Student) obj;
			return tmp.id == id;
		} else {
			return false;
		}
	}
}
