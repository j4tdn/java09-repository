package bean;

import java.io.Serializable;
import java.util.Objects;

public class Apple implements Serializable {
	
	private static final long serialVersionUID = -9001239065138842138L;
	private String id;
	private String color;
	private transient double weight;
	private transient String origin;
	public Apple() {
		super();
	}
	
	public Apple(String id) {
		super();
		this.id = id;
	}


	public Apple(String id, String color, double weight, String origin) {
		super();
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.origin = origin;
	}
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Apple)) {
			return false;
		}
		
		Apple that = (Apple) o;
		return getId().equals(that.getId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public String toString() {
		return id + ", " + color + ", " + weight + ", " + origin;
	}
}
