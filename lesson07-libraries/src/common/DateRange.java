package common;

public class DateRange {
	private long years;
	private long months;
	private long days;
	
	public DateRange() {
		// TODO Auto-generated constructor stub
	}

	public DateRange(long days, long months, long years) {
		super();
		this.days = days;
		this.months = months;
		this.years = years;
	}

	public long getDays() {
		return days;
	}

	public void setDays(long days) {
		this.days = days;
	}

	public long getMonths() {
		return months;
	}

	public void setMonths(long months) {
		this.months = months;
	}

	public long getYears() {
		return years;
	}

	public void setYears(long years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "DateRange [" + years + ", " + months + ", " + days + "]";
	}
	
	

}
