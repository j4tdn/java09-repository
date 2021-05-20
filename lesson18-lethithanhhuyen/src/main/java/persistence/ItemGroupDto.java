package persistence;

public class ItemGroupDto {
	
	public static final String IGR_ID = "igrId";
	public static final String IGR_NAME = "igrName";
	public static final String AMOUNT_STOCK = "amountStock";
	
	private Integer igrId;
	private String igrName;
	private Long amountStock;
	
	public ItemGroupDto() {
	}
	
	public ItemGroupDto(Integer igrId, String igrName, Long amountStock) {
		super();
		this.igrId = igrId;
		this.igrName = igrName;
		this.amountStock = amountStock;
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

	public Long getAmountStock() {
		return amountStock;
	}
	
	public void setAmountStock(Long amountStock) {
		this.amountStock = amountStock;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igrId=" + igrId + ", igrName=" + igrName + ", amountStock=" + amountStock + "]";
	}
	
}
