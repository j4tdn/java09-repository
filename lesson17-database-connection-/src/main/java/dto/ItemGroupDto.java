package dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ItemGroupDto {
	private Integer igrId;
	private String igrName;
	private String itemList;
	private Integer totalOfItem;
	
	
	public ItemGroupDto() {
		super();
	}

	public ItemGroupDto(Integer igrId, String igrName, String itemList, Integer totalOfItem) {
		super();
		this.igrId = igrId;
		this.igrName = igrName;
		this.itemList = itemList;
		this.totalOfItem = totalOfItem;
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

	public Integer getTotalOfItem() {
		return totalOfItem;
	}

	public void setTotalOfItem(Integer totalOfItem) {
		this.totalOfItem = totalOfItem;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append(getIgrId()).append(getIgrName()).append(getItemList()).append(getTotalOfItem())
				.toString();
	}
	
}
