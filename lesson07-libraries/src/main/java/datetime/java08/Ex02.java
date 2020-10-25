package datetime.java08;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import common.TimeRange;
import utils.DateUtils;

public class Ex02 {
	// JAVA 07 : date , calendar
	// JAVA 08 : LocalTime, LocalTime, LocalTimeTime
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime lTime = LocalTime.now();
		lTime = lTime.withMinute(46);

		System.out.println("lTime:" + formatter.format(lTime));

		LocalTime formatted = LocalTime.parse("05:12:57", formatter);
		System.out.println("formatted:" + formatted);

		System.out.println("===================");
		LocalTime start = LocalTime.of(10, 15, 16);
		LocalTime end = LocalTime.now();
//	     Duration : LocalTime
		Duration duration = Duration.between(start, end);
		long durations = duration.getSeconds();
		TimeRange timeRange = DateUtils.getDurations(duration);

		System.out.println("Timerange :" + timeRange);
	}
}
