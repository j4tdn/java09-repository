package lesson07.bai2;

public class DateRange {
	private long years;
	private long months;
	private long days;
	
	public DateRange() {
	}

	
	@Override
	public String toString() {
		return + years + " năm , " + months + "tháng, " + days + "ngày, ";
	}


	public DateRange(long years, long months, long days) {
		
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
	
	
}
