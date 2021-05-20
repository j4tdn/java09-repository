package persistence;

import java.util.List;

public class ItemGroup {
	public static final String MaLoai = "itemID";
	public static final String TenLoai = "itemName";
	public static final String SoLuong = "amount";
	private Integer itemID;
	private String itemName;
	private String amount;

	public ItemGroup() {
	}

	public ItemGroup(Integer itemID, String itemName, String amount) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.amount = amount;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemGroup [itemID=" + itemID + ", itemName=" + itemName + ", amount=" + amount + "]";
	}
	
}
