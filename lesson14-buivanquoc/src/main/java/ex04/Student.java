package ex04;

import java.util.Objects;


public class Student  {
private String id;
private String name;
private double point;
private String gender;
public Student(String id, String name, double point, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.point = point;
	this.gender = gender;
}
public Student() {
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPoint() {
	return point;
}
public void setPoint(double point) {
	this.point = point;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public boolean equals(Object o) {
	if (this == o) {
		return true;
	}
	if (!(o instanceof Student)) {
		return false;
	}
	Student that = (Student) o;
	return getId().equals(that.getId());
}

@Override
public int hashCode() {
	return Objects.hash(getId());
}

@Override
public String toString() {
	return id + "," + name + "," + point + "," + gender;
}
}