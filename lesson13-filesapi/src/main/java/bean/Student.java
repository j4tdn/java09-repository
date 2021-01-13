package bean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Student {
	@JsonInclude(Include.NON_NULL)
	private String id;
	
	@JsonInclude(Include.NON_NULL)
	private String name;
	
	@JsonInclude(Include.NON_NULL)
	private List<Grade> grades;
	
	@JsonInclude(Include.NON_NULL)
	private List<String> languages;
	
	@JsonInclude(Include.NON_NULL)
	private Map<String, BigDecimal> points;
	
	public Student() {
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
	
	public void setGrades(List<Grade> grade) {
		this.grades = grade;
	}
	
	public List<Grade> getGrades() {
		return grades;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
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
				.append(getPoints(), that.getPoints())
				.isEquals();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getId())
				.append(getName())
				.append(getLanguages())
				.append(getPoints())
				.toHashCode();
	}
	
	
}
