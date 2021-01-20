package Beans;

public class Person {
	private int age;
	private int sleepedTimeHour;
	private int sleepedTimeMinus;
	private int timeStart;
	private int timeEnd;
			
	public Person() {
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSleepedTimeHour() {
		return sleepedTimeHour;
	}

	public void setSleepedTimeHour(int sleepedTimeHour) {
		this.sleepedTimeHour = sleepedTimeHour;
	}

	public int getSleepedTimeMinus() {
		return sleepedTimeMinus;
	}

	public void setSleepedTimeMinus(int sleepedTimeMinus) {
		this.sleepedTimeMinus = sleepedTimeMinus;
	}

	public int getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(int timeStart) {
		this.timeStart = timeStart;
	}

	public int getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(int timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Person(int age, int sleepedTimeHour, int sleepedTimeMinus, int timeStart, int timeEnd) {
		super();
		this.age = age;
		this.sleepedTimeHour = sleepedTimeHour;
		this.sleepedTimeMinus = sleepedTimeMinus;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}
	
}
