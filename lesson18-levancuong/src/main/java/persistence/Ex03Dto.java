package persistence;

public class Ex03Dto {
	private Integer igrId;
	private String igrName;
	private Integer nofItems;
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
	public Integer getNofItems() {
		return nofItems;
	}
	public void setNofItems(Integer nofItems) {
		this.nofItems = nofItems;
	}
	public Ex03Dto(Integer igrId, String igrName, Integer nofItems) {
		this.igrId = igrId;
		this.igrName = igrName;
		this.nofItems = nofItems;
	}
	public Ex03Dto() {
		
	}
	@Override
	public String toString() {
		return "ItemDto [igrId=" + igrId + ", igrName=" + igrName + ", nofItems=" + nofItems + "]";
	}
}
