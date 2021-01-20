package Ex04;

public class Student {
	private String mssv;
	private String name;
	private Double point;
	private String gender;
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPoint() {
		return point;
	}
	public void setPoint(Double point) {
		this.point = point;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String mssv, String name, Double point, String gender) {
		super();
		this.mssv = mssv;
		this.name = name;
		this.point = point;
		this.gender = gender;
	}
	
}
