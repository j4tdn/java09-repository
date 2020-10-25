package common;

public class DateTimeRange {
	private DateRange dateRange;
	private TimeRange timeRange;

	private DateTimeRange() {

	}

	private DateTimeRange(Builder builder) {
		this.dateRange = builder.dateRange;
		this.timeRange = builder.timeRange;
	}

	public TimeRange getTimeRange() {
		return timeRange;
	}

	public DateRange getDateRange() {
		return dateRange;
	}

	public static Builder builder() {
		return new Builder();
	}
	

	@Override
	public String toString() {
		return " [" + dateRange + "," + timeRange + "]";
	}


	public static class Builder {

		private DateRange dateRange;
		private TimeRange timeRange;

		public Builder withDateRange(DateRange dateRange) {
			this.dateRange = dateRange;
			return this;
		}

		public Builder withTimeRange(TimeRange timeRange) {
			this.timeRange = timeRange;
			return this;
		}

		public DateTimeRange build() {
			return new DateTimeRange(this);
		}
	}
}
