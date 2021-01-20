package exercises;

import java.time.LocalTime;

public class Ex02 {
	public static void main(String[] args) {
		int age = 20;
		int sleptHours = 2;
		int sleptMinutes = 30;
		LocalTime start = LocalTime.of(23, 0);
		
		int sleptTime = sleptHours * 60 + sleptMinutes;
		
		Integer mustSleepTime = getMustSleepTime(age);
		if(mustSleepTime == null) {
			return;
		}
		
		int remainingSleepTime = mustSleepTime - sleptTime;
		if(remainingSleepTime < 0) {
			return;
		}
		
		
		LocalTime end = start.plusMinutes(remainingSleepTime);
		System.out.println("You must get up at: " + end.getHour() + "H" + end.getMinute());
	}

	private static Integer getMustSleepTime(int age) {
		Integer mustSleepMinutes = null;
		if (age <= 0) {
			return null;
		}
		
		if (age <= 3) {
			mustSleepMinutes = 20 * 60;
		} else if (age <= 13) {
			// 10 - 12 hours
			mustSleepMinutes = (10 + 12) * 60 / 2;
		} else if (age <= 17) {
			// 8 - 10 hours
			mustSleepMinutes = (8 + 10) * 60 / 2;
		} else if (age <= 64) {
			// 7 - 9 hours
			mustSleepMinutes = (7 + 9) * 60 / 2;
		} else {
			// 7 - 8 hours
			mustSleepMinutes = (7 + 8) * 60 / 2;
		}
		
		return mustSleepMinutes;
	}
}
