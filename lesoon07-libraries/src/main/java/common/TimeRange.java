package common;

public class TimeRange {
	private long hours;
	private long mintes;
	private long seconds;
	
	public TimeRange() {
		
	}
	

	public TimeRange(long hours, long mintes, long seconds) {
		super();
		this.hours = hours;
		this.mintes = mintes;
		this.seconds = seconds;
	}


	public long getHours() {
		return hours;
	}

	public void setHours(long hours) {
		this.hours = hours;
	}

	public long getMintes() {
		return mintes;
	}

	public void setMintes(long mintes) {
		this.mintes = mintes;
	}

	public long getSeconds() {
		return seconds;
	}

	public void setSeconds(long seconds) {
		this.seconds = seconds;
	}


	@Override
	public String toString() {
		return "TimeRange [" + hours + ", " + mintes + ", " + seconds + "]";
	}
	
}
