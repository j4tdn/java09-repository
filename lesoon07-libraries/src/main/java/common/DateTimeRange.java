package common;

public class DateTimeRange {
	private DateRange dateRange;
	private TimeRange timeRange;

	private DateTimeRange() {

	}

	public DateRange getDateRange() {
		return dateRange;
	}

	public TimeRange getTimeRange() {
		return timeRange;
	}

	private DateTimeRange(Builder builder) {
		this.dateRange = builder.dateRange;
		this.timeRange = builder.timeRange;
	}

	public static Builder builder() {
		return new Builder();
	}
	

	@Override
	public String toString() {
		return "DateTimeRange [" + dateRange + ", " + timeRange + "]";
	}


	public static class Builder {
		private DateRange dateRange;
		private TimeRange timeRange;

		private Builder() {

		}

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
