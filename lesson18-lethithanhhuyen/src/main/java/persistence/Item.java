package persistence;

import java.time.LocalTime;

public class Item {
	
	public static final String ITEM_ID = "itemId";
	public static final String ITEM_NAME = "itemName";
	public static final String AMOUNT_SALE = "amountSale";
	
	private Integer itemId;
	private String itemName;
	private Long amountSale;
	
	public Item() {
	}

	
	public Item(Integer itemId, String itemName, Long amountSale) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.amountSale = amountSale;
	}


	public Integer getIgrId() {
		return itemId;
	}

	public void setIgrId(Integer igrId) {
		this.itemId = igrId;
	}

	public String getIgrName() {
		return itemName;
	}

	public void setIgrName(String igrName) {
		this.itemName = igrName;
	}

	public Long getAmountSale() {
		return amountSale;
	}
	
	public void setAmountSale(Long amountSale) {
		this.amountSale = amountSale;
	}


	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", amountSale=" + amountSale + "]";
	}
}
