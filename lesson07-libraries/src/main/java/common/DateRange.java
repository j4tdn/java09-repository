package common;

public class DateRange {
	private long years;
	private long month;
	private long days;
	public DateRange() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DateRange [" + years + ", " + month + ", " + days + "]";
	}
	public DateRange(long years, long month, long days) {
		super();
		this.years = years;
		this.month = month;
		this.days = days;
	}
	public long getYears() {
		return years;
	}
	public void setYears(long years) {
		this.years = years;
	}
	public long getMonth() {
		return month;
	}
	public void setMonth(long month) {
		this.month = month;
	}
	public long getDays() {
		return days;
	}
	public void setDays(long days) {
		this.days = days;
	}
	
	
}
