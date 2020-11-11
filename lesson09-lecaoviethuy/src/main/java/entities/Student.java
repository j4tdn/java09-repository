package entities;

public class Student {
	private int id;
	private String name;
	private Rank rank;
	
	public Student(int id, String name, Rank rank) {
		this.id = id;
		this.name = name;
		this.rank = rank;
	}

	public Student() {
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

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) {
			return false;
		}
		
		if(this == obj) {
			return true;
		}
		
		Student tmp = (Student) obj;
		return tmp.getId() == id;
	}
	
	@Override
	public int hashCode() {
		return System.identityHashCode(id);
	}
	
	@Override
	public String toString() {
		return "id: " + id
				+ ", name: " + name
				+ ", rank: " + rank;
	}
}
