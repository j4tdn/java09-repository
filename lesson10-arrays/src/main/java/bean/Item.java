package bean;

public class Item implements Comparable<Item>{
	private int id;
	private String name;

	public Item(int id, String name) {
		super();
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
		return this.id + "," + this.name;
	}

	@Override
	public int compareTo(Item o) {
		//return this.getId()-o.getId();
		return this.getName().compareTo(o.getName());
	}

}
