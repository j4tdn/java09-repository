package lesson07.bai2;

import lesson07.bai2.DateRange;
public class DayTimeRange {
	private DateRange dateRange;
	private TimeRange timeRange;
	
	private DayTimeRange() {
	}
	private DayTimeRange(Builder builder) {
		this.dateRange = builder.dateRange;
		this.timeRange = builder.timeRange;
	}
	
	public DateRange getDateRange() {
		return dateRange;
	}
	public TimeRange getTimeRange() {
		return timeRange;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private DateRange dateRange;
		private TimeRange timeRange;
		
		private Builder() {
			
		}
		public Builder withDateRange(DateRange dayRange) {
			this.dateRange = dayRange;
			return this;
		}
		
		public Builder withTimeRange(TimeRange timeRange) {
			this.timeRange = timeRange;
			return this;
		}
		public DayTimeRange build() {
			return new DayTimeRange(this);
		}
	}
}
