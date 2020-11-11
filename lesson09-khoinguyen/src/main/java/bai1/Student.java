package bai1;

public class Student {
	private int id;
	private String Name;
	private Rank rank;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Rank rank) {
		super();
		this.id = id;
		Name = name;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

}