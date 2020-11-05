package common;

public class TimeRange {
	private long hours;
	private long minutes;
	private long seconds;
	
	public TimeRange() {
		
	}
	
	public TimeRange(long hours, long minutes, long seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	@Override
	public String toString() {
		return "TimeRange [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}
	
	
}
