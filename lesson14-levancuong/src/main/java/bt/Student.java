package bt;

public class Student {
	private String id;
	private String name;
	private double averageMark;
	private String gioiTinh;
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
	public double getAverageMark() {
		return averageMark;
	}
	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public Student(String id, String name, double averageMark, String gioiTinh) {
		super();
		this.id = id;
		this.name = name;
		this.averageMark = averageMark;
		this.gioiTinh = gioiTinh;
	}
	
	public Student() {
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+","+this.name+","+this.averageMark+","+this.gioiTinh;
	}
	
	
}
