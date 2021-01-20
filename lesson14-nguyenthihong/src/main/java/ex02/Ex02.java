package ex02;

import java.time.LocalTime;

public class Ex02 {
	public static void main(String[] args) {
		// thoi gian can thiet
		LocalTime neededTime = getNeededSleepingTime(65);
		System.out.println("luong thoi gian ngu can thiet: " + neededTime);

		// thoi gian bat dau ngu
		LocalTime startTime = LocalTime.of(23, 0);
		System.out.println("Thoi gian bat dau ngu: " + startTime);
		// thoi gian thuc day du kien
		LocalTime wakeupTime = startTime.plusHours(neededTime.getHour()).plusMinutes(neededTime.getMinute());
		System.out.println("thoi gian thuc day du kien: " + wakeupTime);
		// thoi gian da ngu
		LocalTime timeSleeped = LocalTime.of(1, 15);
		System.out.println("Thoi gian da ngu: " + timeSleeped);
		// thoi gian thuc day can thiet
		LocalTime result = wakeupTime.minusHours(timeSleeped.getHour()).minusMinutes(timeSleeped.getMinute());
		System.out.println("Can day luc: " + result);
	}

	public static LocalTime getNeededSleepingTime(int age) {
		if (age >= 1 && age <= 3) {
			return LocalTime.of(20, 0);
		}
		if (age >= 4 && age <= 13) {
			return LocalTime.of((10 + 12) / 2, 0);
		}
		if (age >= 14 && age <= 17) {
			return LocalTime.of((8 + 10) / 2, 0);
		}
		if (age >= 18 && age <= 64) {
			return LocalTime.of((7 + 9) / 2, 0);
		}

		return LocalTime.of((7 + 8) / 2, 30);

	}
}
