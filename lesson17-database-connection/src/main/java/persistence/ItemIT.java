package persistence;

public class ItemIT {
	private Integer igrId;
	private String igrName;
	private String itemList;
	private int totalOfItem;
	public ItemIT() {
	}
	public ItemIT(Integer igrId, String igrName, String itemList, int totalOfItem) {
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
