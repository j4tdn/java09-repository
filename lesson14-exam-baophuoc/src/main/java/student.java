
public class student {
	private String ID;
	private String name;
	private double match;
	private String sex;
	
	public student() {
		
	}

	public student(String iD, String name, double match, String sex) {
		super();
		ID = iD;
		this.name = name;
		this.match = match;
		this.sex = sex;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMatch() {
		return match;
	}

	public void setMatch(double match) {
		this.match = match;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "student [ID=" + ID + ", name=" + name + ", match=" + match + ", sex=" + sex + "]";
	}
	
}
