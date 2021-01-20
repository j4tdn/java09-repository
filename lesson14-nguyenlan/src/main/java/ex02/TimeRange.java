package ex02;


public class TimeRange {
	private long hours;
	private long minutes;
	
	public TimeRange() {
		
	}
	public TimeRange(long hours, long minutes) {
		this.hours = hours;
		this.minutes = minutes;
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

	
	@Override
	public String toString() {
		return  hours 
				+ "h"
				 + minutes + "p"
				;
	}
	
	
	
}
