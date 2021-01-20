package ex02;

import java.sql.Time;

public class Ex02 {
	public static void main(String[] args) {
		SleepingTime person = new SleepingTime();
		person.setAge(22);
		System.out.println("tuoi: " + person.getAge());
		person.setSleeped(new TimeRange(1, 15));
		getSleepingTime(person);
		System.out.println("số giờ đã ngủ: " + person.getSleeped() );
		TimeRange started = new TimeRange(23,0);
		System.out.println("gio di ngu: " + started);	
		person.setStartedSleep(started);
		getEndedSleep(person);
		
	}
	private static String getSleepingTime(SleepingTime st) {
		String sleepTime = "";
		if(1 <= st.getAge() && st.getAge() >= 3) {
			sleepTime = " 20 hours";
			st.setSleepingTime(new TimeRange(20, 0));
		}
		if(4 <= st.getAge() && st.getAge() >= 13) {
			sleepTime = " 10 - 12 hours";
			st.setSleepingTime(new TimeRange(11, 0));
		}
		if(14 <= st.getAge() && st.getAge() >= 17) {
			sleepTime = " 8 - 10 hours";
			st.setSleepingTime(new TimeRange(9, 0));
		}
		if(18 <= st.getAge() && st.getAge() >= 64) {
			sleepTime = " 7 - 9 hours";
			st.setSleepingTime(new TimeRange(8, 0));
		}
		if(st.getAge() >= 65) {
			sleepTime = " 7 - 8 hours";
			st.setSleepingTime(new TimeRange(7, 30));
		}
		return sleepTime;
	}
	private static void getEndedSleep(SleepingTime st) {
		TimeRange sleeped = st.getSleeped();
		System.out.println("thời gian đã ngủ: " + sleeped);
		long hours = st.getSleepingTime().getHours();
		long minutes = st.getSleepingTime().getMinutes();
		if(minutes >= sleeped.getMinutes()) {
			minutes = minutes - sleeped.getMinutes();
		} else {
			hours--;
			minutes += 60;
			minutes -= sleeped.getMinutes();
		}
		hours -= sleeped.getHours();	
		System.out.println("cần ngủ thêm: " +hours + " giờ " + minutes + " phút");
		minutes += st.getStartedSleep().getMinutes();
		if(minutes >= 60) {
			minutes -= 60;
			hours++;
		}	
		hours += st.getStartedSleep().getHours();
		if(hours >= 24) {
			hours -= 24;
		}
		st.setEndedSleep(new TimeRange(hours, minutes));
		System.out.println("bạn nên thức dậy lúc: " + st.getEndedSleep());
	}
}
