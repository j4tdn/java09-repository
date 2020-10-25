package common;

public class DateRange {
	private long year;
	private long month;
	private long day;
	public DateRange(long year, long month, long day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public DateRange() {
		super();
	}
	public long getYear() {
		return year;
	}
	public void setYear(long year) {
		this.year = year;
	}
	public long getMonth() {
		return month;
	}
	public void setMonth(long month) {
		this.month = month;
	}
	public long getDay() {
		return day;
	}
	public void setDay(long day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "DateRange [" + year + "," + month + "," + day + "]";
	};
	
	
}
