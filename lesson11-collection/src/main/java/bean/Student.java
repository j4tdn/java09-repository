package bean;

public class Student{
	private int id;
	private String name;

	public Student() {
	}

	public Student(int id, String name) {
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
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj) {
			return true;
			
		}
		if ( !(obj instanceof Student) ) {
			return false;
		}
		Student that = (Student)obj;
		return getId()==that.getId();
				//&&getName().equals(that.getName());
	}
//
//	@Override
//	public int compareTo(Item o) {
//		return getName().compareTo(o.getName());
//	}

	
}
