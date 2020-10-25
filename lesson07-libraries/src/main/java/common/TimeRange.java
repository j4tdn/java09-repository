package common;

public class TimeRange {
	private long hour;
	private long minutes;
	private long second;

	public TimeRange() {
	}

	public TimeRange(long hour, long minutes, long second) {
		super();
		this.hour = hour;
		this.minutes = minutes;
		this.second = second;
	}

	public long getHour() {
		return hour;
	}

	public void setHour(long hour) {
		this.hour = hour;
	}

	public long getMinutes() {
		return minutes;
	}

	public void setMinutes(long minutes) {
		this.minutes = minutes;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "TimeRange [hour=" + hour + ", minutes=" + minutes + ", second=" + second + "]";
	}
}
