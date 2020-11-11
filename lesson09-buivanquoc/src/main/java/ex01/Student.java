package ex01;

public class Student {
	private int id;
	private String name;
	private Title xeploai;

	public Student() {
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", xeploai=" + xeploai + "]";
	}

	public Student(int id, String name, Title xeploai) {
		super();
		this.id = id;
		this.name = name;
		this.xeploai = xeploai;
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

	public Title getXeploai() {
		return xeploai;
	}

	public void setXeploai(Title xeploai) {
		this.xeploai = xeploai;
	}

}
