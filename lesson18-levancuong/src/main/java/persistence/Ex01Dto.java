package persistence;

import java.time.LocalDate;

public class Ex01Dto {
	private Integer igrId;
	@Override
	public String toString() {
		return "Ex01Dto [igrId=" + igrId + ", igrName=" + igrName + ", timeOrder=" + timeOrder + "]";
	}


	private String igrName;
	private LocalDate timeOrder;
	public Integer getIgrId() {
		return igrId;
	}
	public LocalDate getTimeOrder() {
		return timeOrder;
	}
	public void setTimeOrder(LocalDate timeOrder) {
		this.timeOrder = timeOrder;
	}
	public Ex01Dto(Integer igrId, String igrName, LocalDate timeOrder) {
		super();
		this.igrId = igrId;
		this.igrName = igrName;
		this.timeOrder = timeOrder;
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
	
	
	public Ex01Dto() {
		
	}

}
