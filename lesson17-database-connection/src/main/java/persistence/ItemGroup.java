package persistence;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ItemGroup {
	private Integer id;
	private String name;
	
	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
		
		if (!(obj instanceof ItemGroup)) {
			return false;
		}
		
		ItemGroup that = (ItemGroup) obj;
		return new EqualsBuilder()
				.append(id, that.getId())
				.append(name, that.getName())
				.isEquals();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(id)
			.append(name)
			.toHashCode();
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(null)
				.append(id)
				.append(name)
				.build();
	}
	
}
