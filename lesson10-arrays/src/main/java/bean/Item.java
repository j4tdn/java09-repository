package bean;

import static java.util.Comparator.*;

public class Item implements Comparable<Item>{
	private int id;
	private String name;
	
	public Item() {
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

	public Item(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + ", " + name ;
	}
	@Override
	public int compareTo(Item o) {
		//o1:this
		//02:o
		
		// neu o1 > o2 thi return ve 1 so duong, thi han se hoan vi o1 voi o2, nghia la sap xep tang dan
		return getId() - o.getId();//neu muon sap xep theo id
		// :return getName().compareTo(o.getName());//neu muon sap xep theo ten
	}
	
}
