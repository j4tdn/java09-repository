package bean;

import java.util.Objects;

public class Apple {
	private String id;
	private String color;
	private double weight;
	private String origin;

public Apple() {
	
}

public Apple(String id) {
	this.id = id;
}

public Apple(double weight) {
	this.weight = weight;
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

public boolean equals(Object o) {
	if ( this == o) {
		return true;
	}
		if (!(o instanceof Apple)) {
			return false;
		}
		Apple that = (Apple) o;
		return getId()==that.getId();
	}

public int hashCode() {
	return Objects.hash(getId());
}

public String toString() {
	return id + " "+ color+ " "+ weight+ " "+ origin;
}

}
