package practice;

public class Trader {
private final String name;
private final String city;
public String getName() {
	return name;
}
public String getCity() {
	return city;
}
public Trader(String name, String city) {
	this.name = name;
	this.city = city;
}
	public String toString() {
		return " "+this.name+" "+this.city;
	}
}
