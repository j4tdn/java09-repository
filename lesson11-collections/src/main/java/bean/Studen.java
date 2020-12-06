package bean;

import java.util.Comparator;
import java.util.Objects;

public class Studen{
	private int id;
	private String name;

	public Studen() {
		
	}


	@Override
	public String toString() {
		return   id +" "+   name;
	}


	public Studen(int id, String name) {
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
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Studen)) {
			return false;

		}
		Studen that=(Studen)obj;
		return getId()==that.getId();
	}
 @Override
public int hashCode() {
	
	return Objects.hash(getId());
}


}