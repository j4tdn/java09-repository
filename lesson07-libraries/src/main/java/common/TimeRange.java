package common;

public class TimeRange {
	private long hour;
	private long minute;
	private long second;
	public TimeRange() {
		
	}
	public TimeRange(long hour, long minute, long second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public long getHour() {
		return hour;
	}
	public void setHour(long hour) {
		this.hour = hour;
	}
	public long getMinute() {
		return minute;
	}
	public void setMinute(long minute) {
		this.minute = minute;
	}
	public long getSecond() {
		return second;
	}
	public void setSecond(long second) {
		this.second = second;
	}
	@Override
	public String toString() {
		return "TimeRange [" + hour + "," + minute + "," + second + "]";
	}
	
	
}
