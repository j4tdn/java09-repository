package datetime.java08;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import common.TimeRange;
import datetime.DayUltis;

public class Ex02 {
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		LocalTime ltime = LocalTime.now();
		System.out.println("LocalTime : " + ltime);
		ltime = ltime.withHour(12);//set nam
		System.out.println("LocalTime : " + formatter.format(ltime));
		
		LocalTime fomatted = LocalTime.parse("09:02:49", formatter);
		System.out.println("Formatted : " + fomatted);

		
		System.out.println("==================================================");
		
		LocalTime start = LocalTime.of(6, 30, 24);
		LocalTime end = LocalTime.of(9, 12, 15);
		
		//In ra khoang thoi gian giua 2 moc
		Duration duration = Duration.between(start, end);
		TimeRange timeRange = DayUltis.getDurations(duration);
		System.out.println(timeRange);
		
	}
}
