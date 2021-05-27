package persistence;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ItemWithDate {
	public static final String IT_ID= "itId";
	public static final String IT_NAME= "itName";
	public static final String O_TIME= "orderTime";
	
	private Integer itId;
	private String itName;
	private Date orderTime;
	
public ItemWithDate() {
}

public ItemWithDate(Integer itId, String itName, Date orderTime) {
	super();
	this.itId = itId;
	this.itName = itName;
	this.orderTime = orderTime;
}

public Integer getItId() {
	return itId;
}

public void setItId(Integer itId) {
	this.itId = itId;
}

public String getItName() {
	return itName;
}

public void setItName(String itName) {
	this.itName = itName;
}

public Date getOrderTime() {
	return orderTime;
}

public void setOrderTime(Date orderTime) {
	this.orderTime = orderTime;
}

@Override
public String toString() {
	return "ItemWithDate [itId=" + itId + ", itName=" + itName + ", orderTime=" + orderTime + "]";
}


}
