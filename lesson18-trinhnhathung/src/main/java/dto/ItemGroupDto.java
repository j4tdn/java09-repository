package dto;

public class ItemGroupDto {

	public static final String IGR_ID = "igrId";
	public static final String IGR_NAME = "igrName";
	public static final String IGR_QUANTITY = "quantity";

	private Integer igrId;
	private String igrName;
	private Integer quantity;

	public ItemGroupDto() {

	}

	public ItemGroupDto(Integer igrId, String igrName, Integer quantity) {
		super();
		this.igrId = igrId;
		this.igrName = igrName;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igrId=" + igrId + ", igrName=" + igrName + ", quantity=" + quantity + "]";
	}

}
