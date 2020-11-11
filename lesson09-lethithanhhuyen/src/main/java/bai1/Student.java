package bai1;

public class Student {
	private String id;
	private String name;
	private Type type;

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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Student(String id, String name, Type type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "" + id + " - " + name + " - " + type;
	}
	
	
}
