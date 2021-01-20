package ex02;

import java.sql.Time;

public class SleepingTime {
	private int age;
	private  TimeRange sleeped;
	private TimeRange startedSleep;
	private TimeRange sleepingTime;
	private TimeRange endedSleep;
	public SleepingTime() {
	}
	public SleepingTime(int age, TimeRange sleeped, TimeRange startedSleep, TimeRange endedSleep) {
		super();
		this.age = age;
		this.sleeped = sleeped;
		this.startedSleep = startedSleep;
		this.endedSleep = endedSleep;
	}
	public SleepingTime(int age, TimeRange sleeped, TimeRange startedSleep) {
		super();
		this.age = age;
		this.sleeped = sleeped;
		this.startedSleep = startedSleep;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public TimeRange getSleeped() {
		return sleeped;
	}
	public void setSleeped(TimeRange sleeped) {
		this.sleeped = sleeped;
	}
	public TimeRange getStartedSleep() {
		return startedSleep;
	}
	public void setStartedSleep(TimeRange startedSleep) {
		this.startedSleep = startedSleep;
	}
	public TimeRange getEndedSleep() {
		return endedSleep;
	}
	public void setEndedSleep(TimeRange endedSleep) {
		this.endedSleep = endedSleep;
	}
	public TimeRange getSleepingTime() {
		return sleepingTime;
	}
	public void setSleepingTime(TimeRange sleepingTime) {
		this.sleepingTime = sleepingTime;
	}
	
	
}
