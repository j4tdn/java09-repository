package persistence;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Item {
	private Integer id;
	private String name;
	private Double saleIn;
	private Double saleOut;
	
	public Item() {
	}

	public Item(Integer id, String name, Double saleIn, Double saleOut) {
		this.id = id;
		this.name = name;
		this.saleIn = saleIn;
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

	public Double getSaleIn() {
		return saleIn;
	}

	public void setSaleIn(Double saleIn) {
		this.saleIn = saleIn;
	}

	public Double getSaleOut() {
		return saleOut;
	}

	public void setSaleOut(Double saleOut) {
		this.saleOut = saleOut;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if (!(obj instanceof ItemGroup)) {
			return false;
		}
		
		Item that = (Item) obj;
		return new EqualsBuilder()
				.append(id, that.getId())
				.append(name, that.getName())
				.append(saleIn, that.getSaleIn())
				.append(saleOut, that.getSaleOut())
				.isEquals();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(id)
			.append(name)
			.append(saleIn)
			.append(saleOut)
			.toHashCode();
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", saleIn=" + saleIn + ", saleOut=" + saleOut + "]";
	}
}
