package persistence;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Item {
	private Integer id;
	private String name;
	private Double saleIn;
	private Double saleOut;
	public Item(Integer id, String name, Double saleIn, Double saleOut) {
		super();
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
	public String toString() {
			return new ToStringBuilder(this)
					.append(getId())
					.append(getName())
					.append(getSaleIn())
					.append(getSaleOut())
					.toString();
	}
}
