package common;

public class TimeRange {
	private long hours;
	private long minutes;
	private long seconds;

	public TimeRange(long hours, long minutes, long seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public long getHours() {
		return hours;
	}

	public void setHours(long hours) {
		this.hours = hours;
	}

	public long getMinutes() {
		return minutes;
	}

	public void setMinutes(long minutes) {
		this.minutes = minutes;
	}

	public long getSeconds() {
		return seconds;
	}

	public void setSeconds(long seconds) {
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return "TimeRange [" + hours + ", " + minutes + ", " + seconds + "]";
	}

}
