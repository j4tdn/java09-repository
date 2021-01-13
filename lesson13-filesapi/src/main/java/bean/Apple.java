package bean;

import java.io.Serializable;
import java.util.Objects;

public class Apple implements Serializable {
	private static final long serialVersionUID = 6930227023982206958L;
	
	private String id;
	private String color;
	private double weight;
	private String origin;

	public Apple() {

	}

	public Apple(String id) {
		this.id = id;
	}

	public Apple(String id, String color, double weight, String origin) {
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.origin = origin;
	}
	
	public Apple transfer(String line) {
		String[] e = line.split("[, ]+");
		if(e.length != 4) {
			throw new IllegalArgumentException();
		}
		return new Apple(e[0], e[1], Double.valueOf(e[2]), e[3]);
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
		return getColor().equals(that.getColor());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getColor());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + ", " + color + ", " + weight + ", " + origin;
	}

}
