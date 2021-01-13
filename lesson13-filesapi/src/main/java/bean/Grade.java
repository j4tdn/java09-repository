package bean;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Grade {
	private String id;
	private String name;
	
	public Grade() {
	}

	public Grade(String id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(!(o instanceof Grade)) {
			return false;
		}
		
		Grade that = (Grade) o;
		
		return new EqualsBuilder()
				.append(getId(), that.getId())
				.append(getName(), that.getName())
				.isEquals();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getId())
				.append(getName())
				.toHashCode();
	}
}
