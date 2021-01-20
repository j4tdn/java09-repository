package ex04;

public class Student {
	private String id;
	private String name;
	private float point;
	private String sex;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, float point, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
		this.sex = sex;
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
		this.name = name;
	}
	public float getPoint() {
		return point;
	}
	public void setPoint(float point) {
		this.point = point;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + point + ", " + sex;
	}
}
