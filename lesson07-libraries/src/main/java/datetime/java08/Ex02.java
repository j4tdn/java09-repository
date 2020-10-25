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
	// JAVA07: Date, Calendar
	// JAVA08: LocalTime, LocalTime, LocalTimeTime
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime ltime = LocalTime.now();
		ltime = ltime.withHour(11);
		System.out.println("ldate: " + formatter.format(ltime));
		LocalTime formatted = LocalTime.parse("04:30:32", formatter);
		System.out.println("formatted: " + formatted);

		System.out.println("--------------");
		LocalTime start = LocalTime.of(14, 28, 0);
		LocalTime end = LocalTime.of(16, 30, 0);

		// duration
		TimeRange timeRange = DateUtils.getDurations(Duration.between(start, end));
		System.out.println("Thời gian học còn lại: " + timeRange);

	}
}
