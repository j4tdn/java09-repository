package dto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import persistence.Item;

public class ItemGroupDto {
	private Integer igrId;
	private String igrName;
	private String itemList;
	private Integer totalOfItems;
	
	
	public ItemGroupDto() {
	}


	public ItemGroupDto(Integer igrId, String igrName, String itemList, Integer totalOfItems) {
		super();
		this.igrId = igrId;
		this.igrName = igrName;
		this.itemList = itemList;
		this.totalOfItems = totalOfItems;
	}


	public Integer getIgrId() {
		return igrId;
	}


	public void setIgrId(Integer igrId) {
		this.igrId = igrId;
	}


	public String getIgrName() {
		return igrName;
	}


	public void setIgrName(String igrName) {
		this.igrName = igrName;
	}


	public String getItemList() {
		return itemList;
	}


	public void setItemList(String itemList) {
		this.itemList = itemList;
	}


	public Integer getTotalOfItems() {
		return totalOfItems;
	}


	public void setTotalOfItems(Integer totalOfItems) {
		this.totalOfItems = totalOfItems;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if (!(o instanceof Item)) {
			return false;
		}
		ItemGroupDto that = (ItemGroupDto) o;
		
		return new EqualsBuilder()
				.append(getIgrId(), that.getIgrId())
				.append(getIgrName(), that.getIgrName())
				.append(getItemList(), that.getItemList())
				.append(getTotalOfItems(), that.getTotalOfItems())
				.isEquals();
	}
	
	@Override
	public int hashCode() {
		
		return new HashCodeBuilder()
				.append(getIgrId())
				.append(getIgrName())
				.append(getItemList())
				.append(getTotalOfItems())
				.toHashCode();
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE)
				.append(getIgrId())
				.append(getIgrName())
				.append(getItemList())
				.append(getTotalOfItems())
				.build();
	}
	
	
	
}
