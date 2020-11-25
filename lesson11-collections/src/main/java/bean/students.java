package bean;

public class students {
	private int id;
	private String name;

	public students() {

	}

	public students(int id, String name) {
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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof students)) {
			return false;
		}
		students that = (students) obj;
		return getId() == that.getId();
	}

	@Override
	public String toString() {
		return id + "," + name;
	}

}
