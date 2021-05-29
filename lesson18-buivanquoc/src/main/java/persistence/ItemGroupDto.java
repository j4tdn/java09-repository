package persistence;


public class ItemGroupDto {
	public static final String IGR_ID="igrId";
	public static final String IGR_NAME="igrName";
	public static final  String TOTAL_OFIGR="totalOfIgr";

private Integer igrId;
private String igrName;
private Double totalOfIgr;
public ItemGroupDto() {
}
public ItemGroupDto(Integer igrId, String igrName, Double totalOfIgr) {
	super();
	this.igrId = igrId;
	this.igrName = igrName;
	this.totalOfIgr = totalOfIgr;
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
public Double getTotalOfIgr() {
	return totalOfIgr;
}
public void setTotalOfIgr(Double totalOfIgr) {
	this.totalOfIgr = totalOfIgr;
}
@Override
public String toString() {
	return "ItemGroupDto [igrId=" + igrId + ", igrName=" + igrName + ", totalOfIgr=" + totalOfIgr + "]";
}

}
