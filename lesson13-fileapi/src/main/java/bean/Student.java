package bean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Student {
	
	@JsonInclude (Include.NON_NULL)
	private String id;
	
	@JsonInclude (Include.NON_NULL)
	private String name;
	
	@JsonInclude (Include.NON_NULL)
	private List<String> languages;
	
	@JsonInclude (Include.NON_NULL)
	private List<Grade> grades;
	
	@JsonInclude (Include.NON_NULL)
	private Map<String, BigDecimal> point;
	
	
	public Student() {
		super();
	}

	public Student(String id, String name, List<String> languages, Map<String, BigDecimal> point, List<Grade> grades) {
		super();
		this.id = id;
		this.name = name;
		this.languages = languages;
		this.point = point;
		this.grades = grades;
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

	public Map<String, BigDecimal> getPoint() {
		return point;
	}

	public void setPoint(Map<String, BigDecimal> point) {
		this.point = point;
	}
	
	
	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
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
		return new EqualsBuilder()
					.append(getId(), that.getId())
					.append(getName(), that.getName())
					.append(getLanguages(), that.getLanguages())
					.append(getPoint(), that.getPoint())
					.append(getGrades(), that.getGrades())
					.isEquals();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getId())
				.append(getName())
		        .append(getLanguages())
		        .append(getPoint())
		        .append(getGrades())
		        .toHashCode();
	}
}
