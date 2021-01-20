package bean;

public class Student {
	private String id;
	private String name;
	private double mark;
	private String gende;
	
	public Student() {
		
	}
	public Student(String id, String name, double mark, String gende) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.gende = gende;
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
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public String getGende() {
		return gende;
	}
	public void setGende(String gende) {
		this.gende = gende;
	}
	
	@Override
	public String toString() {
		return id +"-"+name+"-"+mark+"-"+gende;
	}
	
}
