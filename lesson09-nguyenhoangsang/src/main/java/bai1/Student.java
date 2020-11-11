package bai1;

public class Student {
	private String MSV;
	private String name;
	private Title title;
	
	public Student() {
	}

	public Student(String mSV, String name, Title title) {
		super();
		MSV = mSV;
		this.name = name;
		this.title = title;
	}

	public String getMSV() {
		return MSV;
	}

	public void setMSV(String mSV) {
		MSV = mSV;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}
	
}
