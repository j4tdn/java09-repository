package common;

public class TimeRange {
	private long hours;
	private long minutes;
	private long sencond;
	public TimeRange() {
		
	}
	@Override
	public String toString() {
		return "TimeRange [" + hours + ", " + minutes + ", " + sencond + "]";
	}
	public TimeRange(long hours, long minutes, long sencond) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.sencond = sencond;
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
	public long getSencond() {
		return sencond;
	}
	public void setSencond(long sencond) {
		this.sencond = sencond;
	}
	
	
	
	
	

}
