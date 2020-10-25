package datetime.java08;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import common.TimeRange;
import datetime.DateUtils;

public class Ex02 {
	// java7: date , calendar
	// java08: LocalTime, localtime,LocalTimetime
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime ltime = LocalTime.now();
		ltime = ltime.withMinute(46);
		formatter.format(ltime);
		System.out.println("ltime: " + formatter.format(ltime));
		LocalTime formatted = LocalTime.parse("05:40:32", formatter);
		System.out.println("formatted: " + formatted);
		System.out.println("==========================");
		LocalTime start = LocalTime.of(10, 15, 16);
		LocalTime end = LocalTime.now();
		// duration
		Duration duration = Duration.between(start, end);
		TimeRange timeRange = DateUtils.getDurations(duration);
		System.out.println(timeRange);

	}

}
