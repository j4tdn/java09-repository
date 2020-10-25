package common;

public class DateRange {
	private long year;
	private long month;
	private long date;
	
	public DateRange() {
		// TODO Auto-generated constructor stub
	}

	public DateRange(long year, long month, long date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
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

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "DateRange [year=" + year + ", month=" + month + ", date=" + date + "]";
	}
	
}
