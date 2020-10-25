package common;

public class DateRange {
	private long years;
	private long months;
	private long days;

	public DateRange() {

	}

	public DateRange(long years, long months, long days) {
		super();
		this.years = years;
		this.months = months;
		this.days = days;
	}

	public long getYears() {
		return years;
	}

	public void setYears(long years) {
		this.years = years;
	}

	public long getMonths() {
		return months;
	}

	public void setMonths(long months) {
		this.months = months;
	}

	public long getDays() {
		return days;
	}

	public void setDays(long days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "DateRange [" + years + ", " + months + ", " + days + "]";
	}

}
