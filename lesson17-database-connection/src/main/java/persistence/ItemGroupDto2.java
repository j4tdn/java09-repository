package persistence;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ItemGroupDto2 {
	
	public static final String ID="igrId";
	public static final String NAME="igrName";
	public static final String ITEM_DETAILS="itemName";
	public static final String TOTAL_OF_ITEMS="totalOfItem";
	
	
	private Integer igrId;
	private String igrName;
	private String itemName;
	private Double totalOfItem;
	
	public ItemGroupDto2() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ItemGroupDto2(Integer igrId, String igrName, String itemList, Double totalOfItem) {
		super();
		this.igrId = igrId;
		this.igrName = igrName;
		this.itemName = itemList;
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
	public String getItemName() {
		return itemName;
	}
	public void setItemList(String itemList) {
		this.itemName = itemList;
	}
	public Double getTotalOfItem() {
		return totalOfItem;
	}
	public void setTotalOfItem(Double totalOfItem) {
		this.totalOfItem = totalOfItem;
	}


	@Override
	public String toString() {
		return "ItemGroupDto [igrId=" + igrId + ", igrName=" + igrName + ", itemList=" + itemName + ", totalOfItem="
				+ totalOfItem + "]";
	}
	
	
	
	
}
