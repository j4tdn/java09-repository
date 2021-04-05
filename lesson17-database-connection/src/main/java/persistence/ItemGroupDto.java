package persistence;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ItemGroupDto {
	private Integer igrId;
	private String igrName;
	private String itemList;
	private Integer totalOfItems;
	
	public ItemGroupDto(Integer igrId, String igrName, String itemList, Integer totalOfItems) {
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
	public String toString() {
		return new ToStringBuilder(this)
				.append(getIgrId())
				.append(getIgrName())
				.append(getItemList())
				.append(getTotalOfItems())
				.toString();
	}
	
	
}
