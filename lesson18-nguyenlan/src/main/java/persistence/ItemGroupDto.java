package persistence;


public class ItemGroupDto {
	public static final String IGR_ID = "igrId";
	public static final String IGR_NAME = "igrName";
	public static final String TOTAL_OF_ITEMS = "totalOfItems";
	
	
	private Integer igrId;
	private String igrName;
	private Long totalOfItems;
	
	
	public ItemGroupDto() {
	}


	public ItemGroupDto(Integer igrId, String igrName, Long totalOfItems) {
		super();
		this.igrId = igrId;
		this.igrName = igrName;
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

	public Long getTotalOfItems() {
		return totalOfItems;
	}


	public void setTotalOfItems(Long totalOfItems) {
		this.totalOfItems = totalOfItems;
	}
	
	@Override
	public String toString() {
		
		return "ItemGroupDto [igrId: " + igrId + " , igrName: " + igrName + " , totalsOfItems: " + totalOfItems + " ]";
	}
}
