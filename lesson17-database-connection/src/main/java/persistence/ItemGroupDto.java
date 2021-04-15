package persistence;

public class ItemGroupDto {
	public static final String ID = "igrId";
	public static final String NAME = "igrName";
	public static final String ITEM_DETAIL = "itemList";
	public static final String TOTAL_OF_ITEM = "totalOfItem";
	
	
	
	private Integer igrId;
	private String igrName;
	private String itemList;
	private int totalOfItem;
	public ItemGroupDto() {
	}
	public ItemGroupDto(Integer igrId, String igrName, String itemList, int totalOfItem) {
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
	public int getTotalOfItem() {
		return totalOfItem;
	}
	public void setTotalOfItem(int totalOfItem) {
		this.totalOfItem = totalOfItem;
	}
	@Override
	public String toString() {
		return "ItemIT [igrId=" + igrId + ", igrName=" + igrName + ", itemList=" + itemList + ", totalOfItem="
				+ totalOfItem + "]";
	}
}
