package common;

public class DateTimeRange {
	private DateRange dateRange;
	private TimeRange timeRange;

	private DateTimeRange() {
	}

	private DateTimeRange(Buider buider) {
		this.dateRange = buider.dateRange;
		this.timeRange = buider.timeRange;
	}

	public DateRange getDateRange() {
		return dateRange;
	}

	public TimeRange getTimeRange() {
		return timeRange;
	}

	public static Buider builder() {
		return new Buider();
	}
	
	@Override
	public String toString() {
		return "DateTimeRange [dateRange=" + dateRange + ", timeRange=" + timeRange + "]";
	}

	public static class Buider {
		private DateRange dateRange;
		private TimeRange timeRange;

		private Buider() {

		}

		public Buider withDateRange(DateRange dateRange) {
			this.dateRange = dateRange;
			return this;
		}

		public Buider withTimeRange(TimeRange timeRange) {
			this.timeRange = timeRange;
			return this;
		}

		public DateTimeRange build() {
			return new DateTimeRange(this);
		}

	}
}
