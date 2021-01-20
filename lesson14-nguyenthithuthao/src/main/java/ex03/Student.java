package ex03;

public class Student {
	private String id;
	private String name;
	private float poit;
	private String gioitinh;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, float poit, String gioitinh) {
		super();
		this.id = id;
		this.name = name;
		this.poit = poit;
		this.gioitinh = gioitinh;
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
	public float getPoit() {
		return poit;
	}
	public void setPoit(int poit) {
		this.poit = poit;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", poit=" + poit + ", gioitinh=" + gioitinh + "]";
	}
	

}
