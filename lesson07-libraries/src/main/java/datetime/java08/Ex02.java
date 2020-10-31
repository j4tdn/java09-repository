package datetime.java08;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import common.TimeRange;
import utils.DayUtils;

public class Ex02 {
	//JAVA07: Date, Calendar
	//JAVA08: LocalTime, LocalTime, LocalTimeTime
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime ltime = LocalTime.now();
		ltime = ltime.withMinute(46);
		System.out.println("ltime: " + formatter.format(ltime));
		
		LocalTime formatted = LocalTime.parse("09:30:35", formatter);
		System.out.println("formatted: " + formatted);
		
		System.out.println("====================");
		LocalTime start = LocalTime.of(10, 15, 16);
		LocalTime end = LocalTime.now();
		
		//Duration: LocalTime, khoang thoi gian giua hai thoi diem
		Duration duration = Duration.between(start, end);
		TimeRange timeRange = DayUtils.getDurations(duration);
		
		System.out.println(timeRange);
	}
}
  