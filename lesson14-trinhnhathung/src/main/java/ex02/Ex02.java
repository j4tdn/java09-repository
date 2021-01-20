package ex02;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Ex02 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		calculate();
	}
	
	public static void calculate () {
		System.out.print("Tuoi:");
		int age = scanner.nextInt();
		System.out.println("Thoi gian da ngu:");
		System.out.print("Gio:");
		int hour = scanner.nextInt();
		System.out.print("Phut:");
		int min = scanner.nextInt();
		Duration sleeped = Duration.ofMinutes(hour * 60 + min);
		System.out.println("Thoi gian bat dau:");
		System.out.print("Gio:");
		int startHour = scanner.nextInt();
		System.out.print("Phut:");
		int startMin = scanner.nextInt();
		LocalTime start = LocalTime.of(startHour, startMin);
		LocalTime result = getTimeWakeup(age, sleeped, start);
		System.out.println(result.getHour() + ":" + result.getMinute());
	}
	
	public static LocalTime getTimeWakeup (int age, Duration sleeped,LocalTime start) {
		float minDurationSleepedFloat = 0;
		if (age <= 3) {
			minDurationSleepedFloat = 20;
		} else if (age <= 13 ) {
			minDurationSleepedFloat = 11;
		} else if (age <= 17 ) {
			minDurationSleepedFloat = 19;
		} else if (age <= 64 ) {
			minDurationSleepedFloat = 8;
		} else if (age == 65 ) {
			minDurationSleepedFloat = 7.5f;
		} 
		
		Duration minDurationSleeped = Duration.ofMinutes((long)((float)minDurationSleepedFloat * 60));
		Duration timeNeededSleep = minDurationSleeped.minus(sleeped);
		
		LocalTime end =start.plusMinutes(timeNeededSleep.toMinutes());
		
		return end;
	}
}
