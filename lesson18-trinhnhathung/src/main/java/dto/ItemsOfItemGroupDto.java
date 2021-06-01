package dto;

public class ItemsOfItemGroupDto {
	public static final String IGR_ID = "igrId";
	public static final String IGR_NAME = "igrName";
	public static final String ITEM_ID = "itemId";
	public static final String ITEM_NAME = "itemName";
	public static final String SALE_PRICE = "salePrice";
	public static final String BUY_PRICE = "buyPrice";
	public static final String QUANTITY = "quantity";

	private Integer igrId;
	private String igrName;
	private Integer itemId;
	private String itemName;
	private Double salePrice;
	private Double buyPrice;
	private Integer quantity;

	public ItemsOfItemGroupDto() {

	}

	public ItemsOfItemGroupDto(Integer igrId, String igrName, Integer itemId, String itemName, Double salePrice,
			Double buyPrice, Integer quantity) {
		super();
		this.igrId = igrId;
		this.igrName = igrName;
		this.itemId = itemId;
		this.itemName = itemName;
		this.salePrice = salePrice;
		this.buyPrice = buyPrice;
		this.quantity = quantity;
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

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ItemsOfItemGroupDto [igrId=" + igrId + ", igrName=" + igrName + ", itemId=" + itemId + ", itemName="
				+ itemName + ", salePrice=" + salePrice + ", buyPrice=" + buyPrice + ", quantity=" + quantity + "]";
	}

}
