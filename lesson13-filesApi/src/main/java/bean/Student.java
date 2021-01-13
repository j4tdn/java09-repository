package bean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Student {
	private String id;
	private String name;
	private List<String> languages;
	private Map<String, BigDecimal> points;	
	private List<Grade> grade;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, List<String> languages, Map<String, BigDecimal> points) {
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
	public Map<String, BigDecimal> getPoints() {
		return points;
	}
	public void setPoints(Map<String, BigDecimal> points) {
		this.points = points;
	}
	public List<Grade> getGrade() {
		return grade;
	}
	public void setGrade(List<Grade> grade) {
		this.grade = grade;
	}
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(!(o instanceof Student)) {
			return false;
		}
		Student that = (Student) o;
		return new EqualsBuilder()
				.append(getId(), that.getId())
				.append(getName(), that.getName())
				.append(getLanguages(), that.getLanguages())
				.append(getPoints(), that.getPoints()).isEquals();
	}
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getId()).append(getName()).append(getLanguages()).append(getPoints()).toHashCode();
	}
}
