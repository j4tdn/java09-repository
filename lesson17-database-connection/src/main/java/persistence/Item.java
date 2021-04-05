package persistence;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Item {
	private Integer id;
	private String name;
	private Double saleInt;
	private Double saleOut;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(Integer id, String name, Double saleInt, Double saleOut) {
		this.id = id;
		this.name = name;
		this.saleInt = saleInt;
		this.saleOut = saleOut;
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
	public Double getSaleInt() {
		return saleInt;
	}
	public void setSaleInt(Double saleInt) {
		this.saleInt = saleInt;
	}
	public Double getSaleOut() {
		return saleOut;
	}
	public void setSaleOut(Double saleOut) {
		this.saleOut = saleOut;
	}


	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append(getId()).append(getName()).append(getSaleInt()).append(getSaleOut()).toString();
	}
	
//	@Override
//	public boolean equals(Object o) {
//		if (this == o) {
//			return true;
//		}
//		if (!(o instanceof Item)) {
//			return false;
//		}
//
//		ItemGroup that=(Item) o;
//		return new EqualsBuilder().append(getId(), that.getId()).append(getName(), that.getName()).isEquals();
//		
//	}
//	
//	@Override
//	public int hashCode() {
//	
//		return new HashCodeBuilder().append(getId()).append(getName()).toHashCode();
//	}
	
}
