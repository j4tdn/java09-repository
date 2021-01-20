package lesson14;

public class Student {
	private String id;
	private String name;
	private double mark;
	private String gt;
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
	public String getGt() {
		return gt;
	}
	public void setGt(String gt) {
		 this.gt = gt;
	}
	public Student() {
		
	}
	public Student(String id, String name, double mark,String gt) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.gt=gt;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 return id +"," +name+","+mark+","+gt;
	}
	
}
