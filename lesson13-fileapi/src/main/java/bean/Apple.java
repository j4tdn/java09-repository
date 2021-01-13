package bean;

import java.io.Serializable;
import java.util.Objects;

public class Apple implements Serializable {

	private static final long serialVersionUID = 1L;
	private String color;
	private String id;
	private double weight;
	private String origin;

	public Apple() {
	}

	public Apple(String id) {
		this.id = id;
	}

	public Apple(String color, String id, double weight, String origin) {
		this.color = color;
		this.id = id;
		this.weight = weight;
		this.origin = origin;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Apple)) {
			return false;
		}
		Apple that = (Apple) obj;
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
