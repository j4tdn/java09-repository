package bean;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Student {
	private String id;
	private String name;
	private List<String> languages;
	private Map<String, Double> points;
	
	public Student() {
	}
	
	public Student(String id, String name, List<String> languages, Map<String, Double> points) {
		this.id = id;
		this.name = name;
		this.languages = languages;
		this.points = points;
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
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public Map<String, Double> getPoints() {
		return points;
	}
	public void setPoints(Map<String, Double> points) {
		this.points = points;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(name)
				.append(languages)
				.append(points)
				.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Student)) {
			return false;
		}
		
		Student that = (Student) obj;
		return new EqualsBuilder()
				.append(id, that.getId())
				.append(name, that.getName())
				.append(languages, that.getLanguages())
				.append(points, that.getPoints())
				.isEquals();
	}
}
