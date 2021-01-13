package bean;

import org.apache.commons.lang3.builder.EqualsBuilder;

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
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;			
		}
		if(!(obj instanceof Grade)) {
			return false;	
		}
		Grade that = (Grade) obj;
		return new EqualsBuilder().append(getId(), that.getId()).append(getName(),that.getName()).isEquals();
	}
}

